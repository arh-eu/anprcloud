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
 * PlateCharsElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlateCharsElementJsonUnmarshaller implements Unmarshaller<PlateCharsElement, JsonUnmarshallerContext> {

    public PlateCharsElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        PlateCharsElement plateCharsElement = new PlateCharsElement();

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
                if (context.testExpression("bgcolor", targetDepth)) {
                    context.nextToken();
                    plateCharsElement.setBgcolor(BgcolorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("charROI", targetDepth)) {
                    context.nextToken();
                    plateCharsElement.setCharROI(CharROIJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("code", targetDepth)) {
                    context.nextToken();
                    plateCharsElement.setCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("color", targetDepth)) {
                    context.nextToken();
                    plateCharsElement.setColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("confidence", targetDepth)) {
                    context.nextToken();
                    plateCharsElement.setConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return plateCharsElement;
    }

    private static PlateCharsElementJsonUnmarshaller instance;

    public static PlateCharsElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlateCharsElementJsonUnmarshaller();
        return instance;
    }
}
