/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import javax.annotation.Generated;

import com.adaptiverecognition.anprcloud.client.model.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Mmr JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MmrJsonUnmarshaller implements Unmarshaller<Mmr, JsonUnmarshallerContext> {

    public Mmr unmarshall(JsonUnmarshallerContext context) throws Exception {
        Mmr mmr = new Mmr();

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
                if (context.testExpression("category", targetDepth)) {
                    context.nextToken();
                    mmr.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("categoryConfidence", targetDepth)) {
                    context.nextToken();
                    mmr.setCategoryConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("color", targetDepth)) {
                    context.nextToken();
                    mmr.setColor(ColorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("colorConfidence", targetDepth)) {
                    context.nextToken();
                    mmr.setColorConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("make", targetDepth)) {
                    context.nextToken();
                    mmr.setMake(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("makeAndModelConfidence", targetDepth)) {
                    context.nextToken();
                    mmr.setMakeAndModelConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    mmr.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("proctime", targetDepth)) {
                    context.nextToken();
                    mmr.setProctime(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return mmr;
    }

    private static MmrJsonUnmarshaller instance;

    public static MmrJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new MmrJsonUnmarshaller();
        }
        return instance;
    }
}
