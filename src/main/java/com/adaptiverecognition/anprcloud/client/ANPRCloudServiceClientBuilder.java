/**
 *
 */
package com.adaptiverecognition.anprcloud.client;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import static com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory.DEFAULT_CACHE_RESPONSE_METADATA;
import static com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory.DEFAULT_SOCKET_TIMEOUT;
import com.amazonaws.retry.PredefinedRetryPolicies;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.adaptiverecognition.anprcloud.client.ANPRCloudService}.
 *
 * @see hu.arh.carmencloud.client.CarmenCloudService#builder
 *
 */
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ANPRCloudServiceClientBuilder extends SdkSyncClientBuilder<ANPRCloudServiceClientBuilder, ANPRCloudService> {

    /**
     * Package private constructor - builder should be created via
     * {@link ANPRCloudService#builder()}
     */
    ANPRCloudServiceClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory() {
            @Override
            protected ClientConfiguration getDefaultConfig() {
                return super.getDefaultConfig().withRetryPolicy(PredefinedRetryPolicies.NO_RETRY_POLICY)
                        .withCacheResponseMetadata(DEFAULT_CACHE_RESPONSE_METADATA)
                        .withSocketTimeout(DEFAULT_SOCKET_TIMEOUT)
                        .withThrottledRetries(ANPRCloudConfig.getConfig().isWithThrottledRetries());
            }
        });
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey API Key that identifies caller.
     */
    @Override
    public void setApiKey(String apiKey) {
        super.setApiKey(apiKey);
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey API Key that identifies caller.
     * @return This object for method chaining.
     */
    public ANPRCloudServiceClientBuilder apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * Construct a synchronous implementation of ANPRCloudService using the
     * current builder configuration.
     *
     * @param params Current builder configuration represented as a parameter
     * object.
     * @return Fully configured implementation of ANPRCloudService.
     */
    @Override
    protected ANPRCloudService build(AwsSyncClientParams params) {
        return new ANPRCloudServiceClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return ANPRCloudConfig.getConfig().getEndpoint();
    }

    @Override
    protected String defaultRegion() {
        return null;
    }

}
