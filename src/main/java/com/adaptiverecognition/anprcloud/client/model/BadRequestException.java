/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model;

import javax.annotation.Generated;

/**
 * Error json model
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.adaptiverecognition.anprcloud.client.model.ANPRCloudServiceException {
    private static final long serialVersionUID = 1L;

    private java.util.List<String> error;

    private String node;

    private Integer nodetime;

    private String version;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setError(java.util.Collection)} or {@link #withError(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException error(String... error) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException error(java.util.Collection<String> error) {
        setError(error);
        return this;
    }

    /**
     * @param node
     */

    @com.fasterxml.jackson.annotation.JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("node")
    public String getNode() {
        return this.node;
    }

    /**
     * @param node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException node(String node) {
        setNode(node);
        return this;
    }

    /**
     * @param nodetime
     */

    @com.fasterxml.jackson.annotation.JsonProperty("nodetime")
    public void setNodetime(Integer nodetime) {
        this.nodetime = nodetime;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("nodetime")
    public Integer getNodetime() {
        return this.nodetime;
    }

    /**
     * @param nodetime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException nodetime(Integer nodetime) {
        setNodetime(nodetime);
        return this;
    }

    /**
     * @param version
     */

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public String getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException version(String version) {
        setVersion(version);
        return this;
    }

}
