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
 * Engines JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnginesJsonUnmarshaller implements Unmarshaller<Engines, JsonUnmarshallerContext> {

    public Engines unmarshall(JsonUnmarshallerContext context) throws Exception {
        Engines engines = new Engines();

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
                if (context.testExpression("anpr", targetDepth)) {
                    context.nextToken();
                    engines.setAnpr(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mmr", targetDepth)) {
                    context.nextToken();
                    engines.setMmr(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return engines;
    }

    private static EnginesJsonUnmarshaller instance;

    public static EnginesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnginesJsonUnmarshaller();
        return instance;
    }
}
