/*
 *
 */
package hu.arh.anprcloud.client;

import com.amazonaws.Protocol;
import com.amazonaws.SdkClientException;
import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import com.amazonaws.opensdk.retry.RetryPolicyBuilder;
import com.amazonaws.retry.v2.RetryPolicyContext;
import com.amazonaws.util.RuntimeHttpUtils;
import hu.arh.anprcloud.client.model.ANPRCloudRequest;
import hu.arh.anprcloud.client.model.ANPRCloudResult;
import hu.arh.anprcloud.client.model.ANPRCloudServiceException;
import hu.arh.anprcloud.client.model.InternalServerErrorException;
import hu.arh.anprcloud.client.model.RequestTimeoutException;
import hu.arh.anprcloud.client.model.ServiceUnavailableException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author laszlo.toth
 */
public class ANPRCloudSample {

    private static final int RETRY_COUNT = 10;

    static {
        try {
            File currentDir = new File(ANPRCloudSample.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
            System.setProperty("log4j.configurationFile", currentDir.getAbsolutePath().concat(File.separator).concat("log4j.properties"));
        } catch (URISyntaxException e) {
            e.printStackTrace(System.err);
        }
    }

    private static final Logger LOGGER = LogManager.getLogger(ANPRCloudSample.class);

    public static void main(String[] args) throws Exception {
        String ak = null;
        File img = null;
        if (args.length >= 2) {
            ak = args[0];
            img = new File(args[1]);
            img = img.exists() && img.isFile() ? img : null;
        }
        if (ak == null || img == null) {
            LOGGER.error("Usage: ANPRCloudSample <api key> <image path>");
            return;
        }

        Map<Integer, AtomicInteger> retries = new HashMap<Integer, AtomicInteger>() {
            {
                for (int i = 1; i <= RETRY_COUNT; i++) {
                    put(i, new AtomicInteger(0));
                }
            }
        };

        final String apiKey = ak;

        ANPRCloudConfig.getConfig()
                .endpoint(RuntimeHttpUtils.toUri("api-eu.anpr-cloud.com", Protocol.HTTPS))
                .stage("/free")
                .withThrottledRetries(false);

        ANPRCloudService service = ANPRCloudService.builder()
                .connectionConfiguration(new ConnectionConfiguration()
                        .maxConnections(1000)
                        .connectionMaxIdleMillis(1000))
                .timeoutConfiguration(new TimeoutConfiguration()
                        .httpRequestTimeout(5000)
                        .totalExecutionTimeout(90000)
                        .socketTimeout(5000))
                .retryPolicy(RetryPolicyBuilder.standard()
                        .retryOnExceptions(
                                SdkClientException.class,
                                ServiceUnavailableException.class,
                                RequestTimeoutException.class,
                                InternalServerErrorException.class)
                        .retryOnStatusCodes(429)
                        .maxNumberOfRetries(RETRY_COUNT)
                        .backoffStrategy((RetryPolicyContext context) -> {
                            AtomicInteger i = retries.get(context.totalRequests());
                            if (i != null) {
                                i.incrementAndGet();
                            }
                            LOGGER.log(Level.DEBUG, "{}. retry: {} ({}) - {}", context.totalRequests(), context.exception(),
                                    context.exception() instanceof ANPRCloudServiceException ? ((ANPRCloudServiceException) context.exception()).getError() : context.exception().getMessage(),
                                    context.originalRequest());
                            return (int) ((Math.random() + context.totalRequests()) * 100);
                        })
                        .build())
                .apiKey(apiKey).build();

        try {
            ANPRCloudRequest processRequest = new ANPRCloudRequest();

            processRequest.setType(ANPRCloudRequest.Type.ANPR);
            //processRequest.setLocation("HUN");
            processRequest.setImage(new FileInputStream(img), img.getName(), Files.probeContentType(img.toPath()));
            LOGGER.log(Level.INFO, "Processing: {}", processRequest);
            ANPRCloudResult result = service.process(processRequest);
            LOGGER.log(Level.INFO, "Request ({}) result: {}", result.sdkResponseMetadata().requestId(), result.getAnswer());
            if (result.getAnswer() != null) {
                if (result.getAnswer().getData() != null && result.getAnswer().getData().getPlates() != null && !result.getAnswer().getData().getPlates().isEmpty()) {
                    if (result.getAnswer().getData().getPlates().size() == 1
                            && result.getAnswer().getData().getPlates().get(0).getUnicodeText() == null
                            && result.getAnswer().getData().getPlates().get(0).getCountry() == null) {
                        LOGGER.log(Level.INFO, "Request ({}): result doesn't contain any plates!", result.sdkResponseMetadata().requestId());
                    } else {
                        AtomicBoolean found = new AtomicBoolean(false);
                        result.getAnswer().getData().getPlates().forEach((plate) -> {
                            String imgname = processRequest.getImageName();
                            imgname = imgname.indexOf('.') != -1 ? imgname.substring(0, imgname.indexOf('.')) : imgname;
                            if (imgname.equalsIgnoreCase(plate.getUnicodeText())/* && plate.getCountry().toLowerCase().startsWith(processRequest.getLocation().toLowerCase())*/) {
                                found.set(true);
                            }
                        });
                        if (!found.get()) {
                            LOGGER.log(Level.INFO, "Request ({}): Recognition failure!", result.sdkResponseMetadata().requestId());
                        }
                    }
                } else {
                    LOGGER.log(Level.INFO, "Request ({}): result doesn't contain 'Plates' block!", result.sdkResponseMetadata().requestId());
                }
            }
        } catch (ANPRCloudServiceException e) {
            LOGGER.log(Level.ERROR, "Request ({}): {} - {} - {}", e.sdkHttpMetadata().requestId(), e.sdkHttpMetadata().httpStatusCode(), e.getClass().getSimpleName(), e.getError());
        } catch (IOException | SdkClientException e) {
            LOGGER.log(Level.ERROR, "Error occured", e);
        }

        service.shutdown();
    }

}
