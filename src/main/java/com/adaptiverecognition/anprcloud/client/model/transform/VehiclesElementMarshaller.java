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
 * VehiclesElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VehiclesElementMarshaller {

    private static final MarshallingInfo<StructuredPojo> MMR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mmr").build();
    private static final MarshallingInfo<StructuredPojo> PLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("plate").build();

    private static final VehiclesElementMarshaller instance = new VehiclesElementMarshaller();

    public static VehiclesElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VehiclesElement vehiclesElement, ProtocolMarshaller protocolMarshaller) {

        if (vehiclesElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vehiclesElement.getMmr(), MMR_BINDING);
            protocolMarshaller.marshall(vehiclesElement.getPlate(), PLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
