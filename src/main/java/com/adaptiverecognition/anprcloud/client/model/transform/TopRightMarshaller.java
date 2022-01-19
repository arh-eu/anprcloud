/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.adaptiverecognition.anprcloud.client.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopRightMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopRightMarshaller {

    private static final MarshallingInfo<Integer> X_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("x").build();
    private static final MarshallingInfo<Integer> Y_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("y").build();

    private static final TopRightMarshaller instance = new TopRightMarshaller();

    public static TopRightMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopRight topRight, ProtocolMarshaller protocolMarshaller) {

        if (topRight == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topRight.getX(), X_BINDING);
            protocolMarshaller.marshall(topRight.getY(), Y_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
