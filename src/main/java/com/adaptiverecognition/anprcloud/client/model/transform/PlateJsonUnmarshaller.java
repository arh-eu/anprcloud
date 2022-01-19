/**
 * 
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import javax.annotation.Generated;

import com.adaptiverecognition.anprcloud.client.model.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Plate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlateJsonUnmarshaller implements Unmarshaller<Plate, JsonUnmarshallerContext> {

    @Override
    public Plate unmarshall(JsonUnmarshallerContext context) throws Exception {
        Plate plate = new Plate();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) {
            token = context.nextToken();
        }
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null) {
                break;
            }

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bgcolor", targetDepth)) {
                    context.nextToken();
                    plate.setBgcolor(BgcolorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("color", targetDepth)) {
                    context.nextToken();
                    plate.setColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("confidence", targetDepth)) {
                    context.nextToken();
                    plate.setConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("plateTypeConfidence", targetDepth)) {
                    context.nextToken();
                    plate.setPlateTypeConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("positionConfidence", targetDepth)) {
                    context.nextToken();
                    plate.setPositionConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("country", targetDepth)) {
                    context.nextToken();
                    plate.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("plateChars", targetDepth)) {
                    context.nextToken();
                    plate.setPlateChars(new ListUnmarshaller<>(PlateCharsElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("plateROI", targetDepth)) {
                    context.nextToken();
                    plate.setPlateROI(PlateROIJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("plateType", targetDepth)) {
                    context.nextToken();
                    plate.setPlateType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("proctime", targetDepth)) {
                    context.nextToken();
                    plate.setProctime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    plate.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unicodeText", targetDepth)) {
                    context.nextToken();
                    plate.setUnicodeText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    plate.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) {
                        break;
                    }
                }
            }
            token = context.nextToken();
        }

        return plate;
    }

    private static PlateJsonUnmarshaller instance;

    public static PlateJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PlateJsonUnmarshaller();
        }
        return instance;
    }
}
