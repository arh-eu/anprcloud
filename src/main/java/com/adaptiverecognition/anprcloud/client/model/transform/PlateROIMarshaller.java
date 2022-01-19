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
 * PlateROIMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlateROIMarshaller {

    private static final MarshallingInfo<StructuredPojo> BOTTOMLEFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bottomLeft").build();
    private static final MarshallingInfo<StructuredPojo> BOTTOMRIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bottomRight").build();
    private static final MarshallingInfo<StructuredPojo> TOPLEFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topLeft").build();
    private static final MarshallingInfo<StructuredPojo> TOPRIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topRight").build();

    private static final PlateROIMarshaller instance = new PlateROIMarshaller();

    public static PlateROIMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PlateROI plateROI, ProtocolMarshaller protocolMarshaller) {

        if (plateROI == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(plateROI.getBottomLeft(), BOTTOMLEFT_BINDING);
            protocolMarshaller.marshall(plateROI.getBottomRight(), BOTTOMRIGHT_BINDING);
            protocolMarshaller.marshall(plateROI.getTopLeft(), TOPLEFT_BINDING);
            protocolMarshaller.marshall(plateROI.getTopRight(), TOPRIGHT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
