/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model.transform;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import javax.annotation.Generated;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudResult;

/**
 * ANPRCloudResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ANPRCloudResultJsonUnmarshaller implements Unmarshaller<ANPRCloudResult, JsonUnmarshallerContext> {

    @Override
    public ANPRCloudResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ANPRCloudResult anprCloudResult = new ANPRCloudResult();

        //int originalDepth = context.getCurrentDepth();
        //String currentParentElement = context.getCurrentParentElement();
        //int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) {
            token = context.nextToken();
        }
        if (token == VALUE_NULL) {
            return anprCloudResult;
        }

        while (true) {
            if (token == null) {
                break;
            }

            anprCloudResult.setAnswer(AnswerJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return anprCloudResult;
    }

    private static ANPRCloudResultJsonUnmarshaller instance;

    public static ANPRCloudResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ANPRCloudResultJsonUnmarshaller();
        }
        return instance;
    }
}
