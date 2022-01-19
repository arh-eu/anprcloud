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
 * CharROIMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CharROIMarshaller {

    private static final MarshallingInfo<StructuredPojo> BOTTOMLEFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bottomLeft").build();
    private static final MarshallingInfo<StructuredPojo> BOTTOMRIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bottomRight").build();
    private static final MarshallingInfo<StructuredPojo> TOPLEFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topLeft").build();
    private static final MarshallingInfo<StructuredPojo> TOPRIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topRight").build();

    private static final CharROIMarshaller instance = new CharROIMarshaller();

    public static CharROIMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CharROI charROI, ProtocolMarshaller protocolMarshaller) {

        if (charROI == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(charROI.getBottomLeft(), BOTTOMLEFT_BINDING);
            protocolMarshaller.marshall(charROI.getBottomRight(), BOTTOMRIGHT_BINDING);
            protocolMarshaller.marshall(charROI.getTopLeft(), TOPLEFT_BINDING);
            protocolMarshaller.marshall(charROI.getTopRight(), TOPRIGHT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
