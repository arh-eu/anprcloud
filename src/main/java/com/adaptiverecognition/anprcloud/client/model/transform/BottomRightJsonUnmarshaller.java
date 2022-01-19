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
 * BottomRight JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BottomRightJsonUnmarshaller implements Unmarshaller<BottomRight, JsonUnmarshallerContext> {

    public BottomRight unmarshall(JsonUnmarshallerContext context) throws Exception {
        BottomRight bottomRight = new BottomRight();

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
                    bottomRight.setX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    bottomRight.setY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bottomRight;
    }

    private static BottomRightJsonUnmarshaller instance;

    public static BottomRightJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BottomRightJsonUnmarshaller();
        return instance;
    }
}
