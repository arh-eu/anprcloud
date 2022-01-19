/**
 * null
 */
package com.adaptiverecognition.anprcloud.client.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/PlateROI" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlateROI implements Serializable, Cloneable, StructuredPojo {

    private BottomLeft bottomLeft;

    private BottomRight bottomRight;

    private TopLeft topLeft;

    private TopRight topRight;

    /**
     * @param bottomLeft
     */

    public void setBottomLeft(BottomLeft bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    /**
     * @return
     */

    public BottomLeft getBottomLeft() {
        return this.bottomLeft;
    }

    /**
     * @param bottomLeft
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateROI bottomLeft(BottomLeft bottomLeft) {
        setBottomLeft(bottomLeft);
        return this;
    }

    /**
     * @param bottomRight
     */

    public void setBottomRight(BottomRight bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * @return
     */

    public BottomRight getBottomRight() {
        return this.bottomRight;
    }

    /**
     * @param bottomRight
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateROI bottomRight(BottomRight bottomRight) {
        setBottomRight(bottomRight);
        return this;
    }

    /**
     * @param topLeft
     */

    public void setTopLeft(TopLeft topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * @return
     */

    public TopLeft getTopLeft() {
        return this.topLeft;
    }

    /**
     * @param topLeft
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateROI topLeft(TopLeft topLeft) {
        setTopLeft(topLeft);
        return this;
    }

    /**
     * @param topRight
     */

    public void setTopRight(TopRight topRight) {
        this.topRight = topRight;
    }

    /**
     * @return
     */

    public TopRight getTopRight() {
        return this.topRight;
    }

    /**
     * @param topRight
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateROI topRight(TopRight topRight) {
        setTopRight(topRight);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBottomLeft() != null)
            sb.append("BottomLeft: ").append(getBottomLeft()).append(",");
        if (getBottomRight() != null)
            sb.append("BottomRight: ").append(getBottomRight()).append(",");
        if (getTopLeft() != null)
            sb.append("TopLeft: ").append(getTopLeft()).append(",");
        if (getTopRight() != null)
            sb.append("TopRight: ").append(getTopRight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlateROI == false)
            return false;
        PlateROI other = (PlateROI) obj;
        if (other.getBottomLeft() == null ^ this.getBottomLeft() == null)
            return false;
        if (other.getBottomLeft() != null && other.getBottomLeft().equals(this.getBottomLeft()) == false)
            return false;
        if (other.getBottomRight() == null ^ this.getBottomRight() == null)
            return false;
        if (other.getBottomRight() != null && other.getBottomRight().equals(this.getBottomRight()) == false)
            return false;
        if (other.getTopLeft() == null ^ this.getTopLeft() == null)
            return false;
        if (other.getTopLeft() != null && other.getTopLeft().equals(this.getTopLeft()) == false)
            return false;
        if (other.getTopRight() == null ^ this.getTopRight() == null)
            return false;
        if (other.getTopRight() != null && other.getTopRight().equals(this.getTopRight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBottomLeft() == null) ? 0 : getBottomLeft().hashCode());
        hashCode = prime * hashCode + ((getBottomRight() == null) ? 0 : getBottomRight().hashCode());
        hashCode = prime * hashCode + ((getTopLeft() == null) ? 0 : getTopLeft().hashCode());
        hashCode = prime * hashCode + ((getTopRight() == null) ? 0 : getTopRight().hashCode());
        return hashCode;
    }

    @Override
    public PlateROI clone() {
        try {
            return (PlateROI) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.PlateROIMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
