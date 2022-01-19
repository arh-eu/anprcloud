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
 * Bgcolor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BgcolorJsonUnmarshaller implements Unmarshaller<Bgcolor, JsonUnmarshallerContext> {

    public Bgcolor unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bgcolor bgcolor = new Bgcolor();

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
                if (context.testExpression("b", targetDepth)) {
                    context.nextToken();
                    bgcolor.setB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("g", targetDepth)) {
                    context.nextToken();
                    bgcolor.setG(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("r", targetDepth)) {
                    context.nextToken();
                    bgcolor.setR(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bgcolor;
    }

    private static BgcolorJsonUnmarshaller instance;

    public static BgcolorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BgcolorJsonUnmarshaller();
        return instance;
    }
}
