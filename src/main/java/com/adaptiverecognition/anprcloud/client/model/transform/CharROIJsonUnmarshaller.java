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
 * CharROI JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CharROIJsonUnmarshaller implements Unmarshaller<CharROI, JsonUnmarshallerContext> {

    public CharROI unmarshall(JsonUnmarshallerContext context) throws Exception {
        CharROI charROI = new CharROI();

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
                if (context.testExpression("bottomLeft", targetDepth)) {
                    context.nextToken();
                    charROI.setBottomLeft(BottomLeftJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bottomRight", targetDepth)) {
                    context.nextToken();
                    charROI.setBottomRight(BottomRightJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("topLeft", targetDepth)) {
                    context.nextToken();
                    charROI.setTopLeft(TopLeftJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("topRight", targetDepth)) {
                    context.nextToken();
                    charROI.setTopRight(TopRightJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return charROI;
    }

    private static CharROIJsonUnmarshaller instance;

    public static CharROIJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CharROIJsonUnmarshaller();
        return instance;
    }
}
