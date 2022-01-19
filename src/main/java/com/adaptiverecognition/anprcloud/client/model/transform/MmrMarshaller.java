/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.adaptiverecognition.anprcloud.client.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MmrMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MmrMarshaller {

    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("category").build();
    private static final MarshallingInfo<Integer> CATEGORYCONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("categoryConfidence").build();
    private static final MarshallingInfo<StructuredPojo> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("color").build();
    private static final MarshallingInfo<Integer> COLORCONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorConfidence").build();
    private static final MarshallingInfo<String> MAKE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("make").build();
    private static final MarshallingInfo<Integer> MAKEANDMODELCONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("makeAndModelConfidence").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<Integer> PROCTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("proctime").build();

    private static final MmrMarshaller instance = new MmrMarshaller();

    public static MmrMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     *
     * @param mmr
     * @param protocolMarshaller
     */
    public void marshall(Mmr mmr, ProtocolMarshaller protocolMarshaller) {

        if (mmr == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mmr.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(mmr.getCategoryConfidence(), CATEGORYCONFIDENCE_BINDING);
            protocolMarshaller.marshall(mmr.getColor(), COLOR_BINDING);
            protocolMarshaller.marshall(mmr.getColorConfidence(), COLORCONFIDENCE_BINDING);
            protocolMarshaller.marshall(mmr.getMake(), MAKE_BINDING);
            protocolMarshaller.marshall(mmr.getMakeAndModelConfidence(), MAKEANDMODELCONFIDENCE_BINDING);
            protocolMarshaller.marshall(mmr.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(mmr.getProctime(), PROCTIME_BINDING);
        } catch (SdkClientException e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
