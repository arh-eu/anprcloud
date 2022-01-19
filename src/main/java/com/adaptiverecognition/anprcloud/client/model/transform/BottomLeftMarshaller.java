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
 * BottomLeftMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BottomLeftMarshaller {

    private static final MarshallingInfo<Integer> X_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("x").build();
    private static final MarshallingInfo<Integer> Y_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("y").build();

    private static final BottomLeftMarshaller instance = new BottomLeftMarshaller();

    public static BottomLeftMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BottomLeft bottomLeft, ProtocolMarshaller protocolMarshaller) {

        if (bottomLeft == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bottomLeft.getX(), X_BINDING);
            protocolMarshaller.marshall(bottomLeft.getY(), Y_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
