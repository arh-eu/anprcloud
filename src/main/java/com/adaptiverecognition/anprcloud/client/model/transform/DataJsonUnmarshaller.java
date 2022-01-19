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
 * Data JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataJsonUnmarshaller implements Unmarshaller<Data, JsonUnmarshallerContext> {

    public Data unmarshall(JsonUnmarshallerContext context) throws Exception {
        Data data = new Data();

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
                if (context.testExpression("vehicles", targetDepth)) {
                    context.nextToken();
                    data.setVehicles(new ListUnmarshaller<VehiclesElement>(VehiclesElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return data;
    }

    private static DataJsonUnmarshaller instance;

    public static DataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataJsonUnmarshaller();
        return instance;
    }
}
