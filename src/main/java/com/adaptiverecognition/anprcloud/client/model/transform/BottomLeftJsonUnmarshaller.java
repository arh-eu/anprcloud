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
 * BottomLeft JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BottomLeftJsonUnmarshaller implements Unmarshaller<BottomLeft, JsonUnmarshallerContext> {

    public BottomLeft unmarshall(JsonUnmarshallerContext context) throws Exception {
        BottomLeft bottomLeft = new BottomLeft();

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
                if (context.testExpression("x", targetDepth)) {
                    context.nextToken();
                    bottomLeft.setX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    bottomLeft.setY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bottomLeft;
    }

    private static BottomLeftJsonUnmarshaller instance;

    public static BottomLeftJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BottomLeftJsonUnmarshaller();
        return instance;
    }
}
