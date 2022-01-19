/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import com.adaptiverecognition.anprcloud.client.apigateway.ApiGatewayProtocolFactoryImpl;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.adaptiverecognition.anprcloud.client.ANPRCloudConfig;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudRequest;

/**
 * ANPRCloudRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ANPRCloudRequestProtocolMarshaller implements Marshaller<Request<ANPRCloudRequest>, ANPRCloudRequest> {

    private static final OperationInfo ANPR_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY)
            .requestUri("/" + ANPRCloudConfig.getConfig().getStage() + (ANPRCloudConfig.getConfig().getRegion() != null ? "/" + ANPRCloudConfig.getConfig().getRegion() : ""))
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(true).hasPayloadMembers(true).serviceName("ANPRCloudService").build();

    private final ApiGatewayProtocolFactoryImpl protocolFactory;

    public ANPRCloudRequestProtocolMarshaller(ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    @Override
    public Request<ANPRCloudRequest> marshall(ANPRCloudRequest anprCloudRequest) {

        if (anprCloudRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<ANPRCloudRequest> protocolMarshaller
                    = protocolFactory.createProtocolMarshaller(ANPR_OPERATION_BINDING, anprCloudRequest);
            protocolMarshaller.startMarshalling();
            ANPRCloudRequestMarshaller.getInstance().marshall(anprCloudRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
