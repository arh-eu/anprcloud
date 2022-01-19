/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model;

import com.amazonaws.opensdk.SdkErrorHttpMetadata;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.annotation.SdkInternalApi;
import javax.annotation.Generated;

/**
 * Base exception for all service exceptions thrown by Carmen Cloud
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ANPRCloudServiceException extends com.amazonaws.SdkBaseException implements BaseException {

    private static final long serialVersionUID = 1L;

    private SdkErrorHttpMetadata sdkHttpMetadata;

    private java.util.List<String> error;

    private String nodename;

    private String message;

    /**
     * Constructs a new ANPRCloudServiceException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ANPRCloudServiceException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public ANPRCloudServiceException sdkHttpMetadata(SdkErrorHttpMetadata sdkHttpMetadata) {
        this.sdkHttpMetadata = sdkHttpMetadata;
        return this;
    }

    @Override
    public SdkErrorHttpMetadata sdkHttpMetadata() {
        return sdkHttpMetadata;
    }

    @SdkInternalApi
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * @return
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public java.util.List<String> getError() {
        return error;
    }

    /**
     * @param error
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(java.util.Collection<String> error) {
        if (error == null) {
            this.error = null;
            return;
        }

        this.error = new java.util.ArrayList<String>(error);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setError(java.util.Collection)} or
     * {@link #withError(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     *
     * @param error
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudServiceException error(String... error) {
        if (this.error == null) {
            setError(new java.util.ArrayList<String>(error.length));
        }
        for (String ele : error) {
            this.error.add(ele);
        }
        return this;
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudServiceException error(java.util.Collection<String> error) {
        setError(error);
        return this;
    }

    /**
     * @return
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodename")
    public String getNodename() {
        return nodename;
    }

    /**
     * @param nodename
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodename")
    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    /**
     * @param nodename
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudServiceException nodename(String nodename) {
        setNodename(nodename);
        return this;
    }

}
