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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/__PlateCharsElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlateCharsElement implements Serializable, Cloneable, StructuredPojo {

    private Bgcolor bgcolor;

    private CharROI charROI;

    private Integer code;

    private Color color;

    private Integer confidence;

    /**
     * @param bgcolor
     */

    public void setBgcolor(Bgcolor bgcolor) {
        this.bgcolor = bgcolor;
    }

    /**
     * @return
     */

    public Bgcolor getBgcolor() {
        return this.bgcolor;
    }

    /**
     * @param bgcolor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateCharsElement bgcolor(Bgcolor bgcolor) {
        setBgcolor(bgcolor);
        return this;
    }

    /**
     * @param charROI
     */

    public void setCharROI(CharROI charROI) {
        this.charROI = charROI;
    }

    /**
     * @return
     */

    public CharROI getCharROI() {
        return this.charROI;
    }

    /**
     * @param charROI
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateCharsElement charROI(CharROI charROI) {
        setCharROI(charROI);
        return this;
    }

    /**
     * @param code
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateCharsElement code(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * @param color
     */

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return
     */

    public Color getColor() {
        return this.color;
    }

    /**
     * @param color
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateCharsElement color(Color color) {
        setColor(color);
        return this;
    }

    /**
     * @param confidence
     */

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * @return
     */

    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * @param confidence
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlateCharsElement confidence(Integer confidence) {
        setConfidence(confidence);
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
        if (getBgcolor() != null)
            sb.append("Bgcolor: ").append(getBgcolor()).append(",");
        if (getCharROI() != null)
            sb.append("CharROI: ").append(getCharROI()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlateCharsElement == false)
            return false;
        PlateCharsElement other = (PlateCharsElement) obj;
        if (other.getBgcolor() == null ^ this.getBgcolor() == null)
            return false;
        if (other.getBgcolor() != null && other.getBgcolor().equals(this.getBgcolor()) == false)
            return false;
        if (other.getCharROI() == null ^ this.getCharROI() == null)
            return false;
        if (other.getCharROI() != null && other.getCharROI().equals(this.getCharROI()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgcolor() == null) ? 0 : getBgcolor().hashCode());
        hashCode = prime * hashCode + ((getCharROI() == null) ? 0 : getCharROI().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public PlateCharsElement clone() {
        try {
            return (PlateCharsElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.PlateCharsElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
