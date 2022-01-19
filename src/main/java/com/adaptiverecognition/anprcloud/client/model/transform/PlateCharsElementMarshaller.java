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
 * PlateCharsElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlateCharsElementMarshaller {

    private static final MarshallingInfo<StructuredPojo> BGCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bgcolor").build();
    private static final MarshallingInfo<StructuredPojo> CHARROI_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("charROI").build();
    private static final MarshallingInfo<Integer> CODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("code").build();
    private static final MarshallingInfo<StructuredPojo> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("color").build();
    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confidence").build();

    private static final PlateCharsElementMarshaller instance = new PlateCharsElementMarshaller();

    public static PlateCharsElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PlateCharsElement plateCharsElement, ProtocolMarshaller protocolMarshaller) {

        if (plateCharsElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(plateCharsElement.getBgcolor(), BGCOLOR_BINDING);
            protocolMarshaller.marshall(plateCharsElement.getCharROI(), CHARROI_BINDING);
            protocolMarshaller.marshall(plateCharsElement.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(plateCharsElement.getColor(), COLOR_BINDING);
            protocolMarshaller.marshall(plateCharsElement.getConfidence(), CONFIDENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
