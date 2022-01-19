/**
 *
 */
package com.adaptiverecognition.anprcloud.client;

import javax.annotation.Generated;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonErrorShapeMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudRequest;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudResult;
import com.adaptiverecognition.anprcloud.client.model.transform.ANPRCloudRequestProtocolMarshaller;
import com.adaptiverecognition.anprcloud.client.model.transform.ANPRCloudResultJsonUnmarshaller;
import com.adaptiverecognition.anprcloud.client.apigateway.ApiGatewayProtocolFactoryImpl;
import com.adaptiverecognition.anprcloud.client.model.BadRequestException;
import com.adaptiverecognition.anprcloud.client.model.InternalServerErrorException;
import com.adaptiverecognition.anprcloud.client.model.NotFoundException;
import com.adaptiverecognition.anprcloud.client.model.RequestTimeoutException;
import com.adaptiverecognition.anprcloud.client.model.ServiceUnavailableException;
import java.util.Arrays;

/**
 * Client for accessing CarmenCloudService. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 *
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ANPRCloudServiceClient implements ANPRCloudService {
    
    private final ClientHandler clientHandler;
    
    private static final ApiGatewayProtocolFactoryImpl protocolFactory = new ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(true).withSupportsIon(true)/*.withContentTypeOverride("multipart/form-data")*/
                    .addErrorMetadata(new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(com.adaptiverecognition.anprcloud.client.model.NotFoundException.class))
                    .addErrorMetadata(new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(com.adaptiverecognition.anprcloud.client.model.ServiceUnavailableException.class))
                    .addErrorMetadata(new JsonErrorShapeMetadata().withErrorCode("RequestTimeoutException").withModeledClass(com.adaptiverecognition.anprcloud.client.model.RequestTimeoutException.class))
                    .addErrorMetadata(new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(com.adaptiverecognition.anprcloud.client.model.BadRequestException.class))
                    .addErrorMetadata(new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(com.adaptiverecognition.anprcloud.client.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.adaptiverecognition.anprcloud.client.model.ANPRCloudServiceException.class));

    /**
     * Constructs a new client to invoke service methods on CarmenCloudService
     * using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientParams Object providing client parameters.
     */
    ANPRCloudServiceClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param carmenCloudRequest
     * @return Result of the process operation returned by the service.
     * @sample CarmenCloudService.process
     * @see
     * <a href="http://docs.aws.amazon.com/goto/WebAPI/ol6anslmcc-2020-04-27T16:19:44Z/process" target="_top">AWS
     * API Documentation</a>
     */
    @Override
    public ANPRCloudResult process(ANPRCloudRequest carmenCloudRequest) {
        
        HttpResponseHandler<ANPRCloudResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new ANPRCloudResultJsonUnmarshaller());
        
        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(NotFoundException.class).withHttpStatusCode(404),
                new JsonErrorShapeMetadata().withModeledClass(ServiceUnavailableException.class).withHttpStatusCode(503), new JsonErrorShapeMetadata()
                .withModeledClass(BadRequestException.class).withHttpStatusCode(400),
                new JsonErrorShapeMetadata().withModeledClass(RequestTimeoutException.class).withHttpStatusCode(408), new JsonErrorShapeMetadata()
                .withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500));
        
        return clientHandler.execute(new ClientExecutionParams<ANPRCloudRequest, ANPRCloudResult>().withMarshaller(new ANPRCloudRequestProtocolMarshaller(protocolFactory))
                .withResponseHandler(responseHandler).withErrorResponseHandler(errorResponseHandler).withInput(carmenCloudRequest));
    }

    /**
     * Create the error response handler for the operation.
     *
     * @param errorShapeMetadata Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }
    
    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }
    
}
