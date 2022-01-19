/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.adaptiverecognition.anprcloud.client.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VehiclesElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VehiclesElementJsonUnmarshaller implements Unmarshaller<VehiclesElement, JsonUnmarshallerContext> {

    public VehiclesElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        VehiclesElement vehiclesElement = new VehiclesElement();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("mmr", targetDepth)) {
                    context.nextToken();
                    vehiclesElement.setMmr(MmrJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("plate", targetDepth)) {
                    context.nextToken();
                    vehiclesElement.setPlate(PlateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vehiclesElement;
    }

    private static VehiclesElementJsonUnmarshaller instance;

    public static VehiclesElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VehiclesElementJsonUnmarshaller();
        return instance;
    }
}
