/**
 * 
 */
package com.adaptiverecognition.anprcloud.client;

import com.adaptiverecognition.anprcloud.client.model.ANPRCloudRequest;
import com.adaptiverecognition.anprcloud.client.model.ANPRCloudResult;
import javax.annotation.Generated;

/**
 * Interface for accessing ANPRCloudService.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ANPRCloudService {

    /**
     * @param anprCloudRequest
     * @return Result of the process operation returned by the service.
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws RequestTimeoutException
     * @throws InternalServerErrorException
     * @sample ANPRCloudService.process
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ol6anslmcc-2020-05-04T08:02:27Z/process" target="_top">AWS
     *      API Documentation</a>
     */
    ANPRCloudResult process(ANPRCloudRequest anprCloudRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ANPRCloudServiceClientBuilder builder() {
        return new ANPRCloudServiceClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

}
