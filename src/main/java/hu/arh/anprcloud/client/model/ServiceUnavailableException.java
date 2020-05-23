/**
 * null
 */
package hu.arh.anprcloud.client.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUnavailableException extends hu.arh.anprcloud.client.model.ANPRCloudServiceException {
    private static final long serialVersionUID = 1L;

    private String node;

    private Integer nodetime;

    /**
     * Constructs a new ServiceUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceUnavailableException(String message) {
        super(message);
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

    public ServiceUnavailableException error(String... error) {
        return (ServiceUnavailableException)super.error(error);
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUnavailableException error(java.util.Collection<String> error) {
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

    public ServiceUnavailableException node(String node) {
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

    public ServiceUnavailableException nodetime(Integer nodetime) {
        setNodetime(nodetime);
        return this;
    }

}
