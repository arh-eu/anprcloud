/**
 * 
 */
package com.adaptiverecognition.anprcloud.client.model.transform;


import javax.annotation.Generated;

import com.adaptiverecognition.anprcloud.client.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Answer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerJsonUnmarshaller implements Unmarshaller<Answer, JsonUnmarshallerContext> {

    @Override
    public Answer unmarshall(JsonUnmarshallerContext context) throws Exception {
        Answer answer = new Answer();

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
                if (context.testExpression("data", targetDepth)) {
                    context.nextToken();
                    answer.setData(DataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("engines", targetDepth)) {
                    context.nextToken();
                    answer.setEngines(EnginesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nodename", targetDepth)) {
                    context.nextToken();
                    answer.setNodename(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodetime", targetDepth)) {
                    context.nextToken();
                    answer.setNodetime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    answer.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return answer;
    }

    private static AnswerJsonUnmarshaller instance;

    public static AnswerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnswerJsonUnmarshaller();
        return instance;
    }
}
