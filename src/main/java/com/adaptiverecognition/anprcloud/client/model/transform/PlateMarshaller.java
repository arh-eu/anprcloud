/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.adaptiverecognition.anprcloud.client.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PlateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlateMarshaller {

    private static final MarshallingInfo<StructuredPojo> BGCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bgcolor").build();
    private static final MarshallingInfo<StructuredPojo> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("color").build();
    private static final MarshallingInfo<Integer> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confidence").build();
    private static final MarshallingInfo<Integer> PLATE_TYPE_CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("plateTypeConfidence").build();
    private static final MarshallingInfo<Integer> POSITION_CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("positionConfidence").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("country").build();
    private static final MarshallingInfo<List> PLATECHARS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("plateChars").build();
    private static final MarshallingInfo<StructuredPojo> PLATEROI_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("plateROI").build();
    private static final MarshallingInfo<Integer> PLATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("plateType").build();
    private static final MarshallingInfo<Integer> PROCTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proctime").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> UNICODETEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unicodeText").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("category").build();

    private static final PlateMarshaller instance = new PlateMarshaller();

    public static PlateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     *
     * @param plate
     * @param protocolMarshaller
     */
    public void marshall(Plate plate, ProtocolMarshaller protocolMarshaller) {

        if (plate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(plate.getBgcolor(), BGCOLOR_BINDING);
            protocolMarshaller.marshall(plate.getColor(), COLOR_BINDING);
            protocolMarshaller.marshall(plate.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(plate.getPlateTypeConfidence(), PLATE_TYPE_CONFIDENCE_BINDING);
            protocolMarshaller.marshall(plate.getPositionConfidence(), POSITION_CONFIDENCE_BINDING);
            protocolMarshaller.marshall(plate.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(plate.getPlateChars(), PLATECHARS_BINDING);
            protocolMarshaller.marshall(plate.getPlateROI(), PLATEROI_BINDING);
            protocolMarshaller.marshall(plate.getPlateType(), PLATETYPE_BINDING);
            protocolMarshaller.marshall(plate.getProctime(), PROCTIME_BINDING);
            protocolMarshaller.marshall(plate.getState(), STATE_BINDING);
            protocolMarshaller.marshall(plate.getUnicodeText(), UNICODETEXT_BINDING);
            protocolMarshaller.marshall(plate.getCategory(), CATEGORY_BINDING);
        } catch (SdkClientException e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
