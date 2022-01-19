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
 * TopRight JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopRightJsonUnmarshaller implements Unmarshaller<TopRight, JsonUnmarshallerContext> {

    public TopRight unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopRight topRight = new TopRight();

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
                    topRight.setX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("y", targetDepth)) {
                    context.nextToken();
                    topRight.setY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topRight;
    }

    private static TopRightJsonUnmarshaller instance;

    public static TopRightJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopRightJsonUnmarshaller();
        return instance;
    }
}
