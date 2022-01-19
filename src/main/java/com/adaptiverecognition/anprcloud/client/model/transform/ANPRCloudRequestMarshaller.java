/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.ProtocolMarshaller;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.UUID;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;

/**
 * ANPRCloudRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ANPRCloudRequestMarshaller {

    private static final MarshallingInfo<InputStream> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final ANPRCloudRequestMarshaller instance = new ANPRCloudRequestMarshaller();

    public static ANPRCloudRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     *
     * @param anprCloudRequest
     * @param protocolMarshaller
     */
    public void marshall(ANPRCloudRequest anprCloudRequest, ProtocolMarshaller protocolMarshaller) {

        if (anprCloudRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setBoundary(UUID.randomUUID().toString());
            if (anprCloudRequest.getImage() != null && anprCloudRequest.getImageName() != null && anprCloudRequest.getMimeType() != null) {
                builder.addBinaryBody("image", anprCloudRequest.getImage(), ContentType.getByMimeType(anprCloudRequest.getMimeType()), anprCloudRequest.getImageName());
            }
            if (anprCloudRequest.getMaxreads() != null) {
                builder.addTextBody("maxreads", String.valueOf(anprCloudRequest.getMaxreads()));
            }
            if (anprCloudRequest.getLocation() != null) {
                builder.addTextBody("location", anprCloudRequest.getLocation());
            }
            builder.addTextBody("service", anprCloudRequest.getType() == ANPRCloudRequest.Type.MMR ? "mmr" : "anpr");
            builder.build().writeTo(baos);
            InputStream content = new ByteArrayInputStream(Base64.getEncoder().encode(baos.toByteArray()));
            protocolMarshaller.marshall(content, CONTENT_BINDING);
        } catch (IOException | SdkClientException e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
