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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/Plate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Plate implements Serializable, Cloneable, StructuredPojo {

    private Bgcolor bgcolor;

    private Color color;

    private Integer confidence;

    private Integer plateTypeConfidence;

    private Integer positionConfidence;

    private String country;

    private java.util.List<PlateCharsElement> plateChars;

    private PlateROI plateROI;

    private Integer plateType;

    private Integer proctime;

    private String state;

    private String unicodeText;

    private String category;

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

    public Plate bgcolor(Bgcolor bgcolor) {
        setBgcolor(bgcolor);
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

    public Plate color(Color color) {
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

    public Plate confidence(Integer confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * @param plateTypeConfidence
     */

    public void setPlateTypeConfidence(Integer plateTypeConfidence) {
        this.plateTypeConfidence = plateTypeConfidence;
    }

    /**
     * @return
     */

    public Integer getPlateTypeConfidence() {
        return this.plateTypeConfidence;
    }

    /**
     * @param plateTypeConfidence
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate plateTypeConfidence(Integer plateTypeConfidence) {
        setPlateTypeConfidence(plateTypeConfidence);
        return this;
    }

    /**
     * @param positionConfidence
     */

    public void setPositionConfidence(Integer positionConfidence) {
        this.positionConfidence = positionConfidence;
    }

    /**
     * @return
     */

    public Integer getPositionConfidence() {
        return this.positionConfidence;
    }

    /**
     * @param positionConfidence
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate PositionConfidence(Integer positionConfidence) {
        setPositionConfidence(positionConfidence);
        return this;
    }

    /**
     * @param country
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate country(String country) {
        setCountry(country);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<PlateCharsElement> getPlateChars() {
        return plateChars;
    }

    /**
     * @param plateChars
     */

    public void setPlateChars(java.util.Collection<PlateCharsElement> plateChars) {
        if (plateChars == null) {
            this.plateChars = null;
            return;
        }

        this.plateChars = new java.util.ArrayList<PlateCharsElement>(plateChars);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlateChars(java.util.Collection)} or {@link #withPlateChars(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param plateChars
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate plateChars(PlateCharsElement... plateChars) {
        if (this.plateChars == null) {
            setPlateChars(new java.util.ArrayList<PlateCharsElement>(plateChars.length));
        }
        for (PlateCharsElement ele : plateChars) {
            this.plateChars.add(ele);
        }
        return this;
    }

    /**
     * @param plateChars
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate plateChars(java.util.Collection<PlateCharsElement> plateChars) {
        setPlateChars(plateChars);
        return this;
    }

    /**
     * @param plateROI
     */

    public void setPlateROI(PlateROI plateROI) {
        this.plateROI = plateROI;
    }

    /**
     * @return
     */

    public PlateROI getPlateROI() {
        return this.plateROI;
    }

    /**
     * @param plateROI
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate plateROI(PlateROI plateROI) {
        setPlateROI(plateROI);
        return this;
    }

    /**
     * @param plateType
     */

    public void setPlateType(Integer plateType) {
        this.plateType = plateType;
    }

    /**
     * @return
     */

    public Integer getPlateType() {
        return this.plateType;
    }

    /**
     * @param plateType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate plateType(Integer plateType) {
        setPlateType(plateType);
        return this;
    }

    /**
     * @param proctime
     */

    public void setProctime(Integer proctime) {
        this.proctime = proctime;
    }

    /**
     * @return
     */

    public Integer getProctime() {
        return this.proctime;
    }

    /**
     * @param proctime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate proctime(Integer proctime) {
        setProctime(proctime);
        return this;
    }

    /**
     * @param state
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate state(String state) {
        setState(state);
        return this;
    }

    /**
     * @param unicodeText
     */

    public void setUnicodeText(String unicodeText) {
        this.unicodeText = unicodeText;
    }

    /**
     * @return
     */

    public String getUnicodeText() {
        return this.unicodeText;
    }

    /**
     * @param unicodeText
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate unicodeText(String unicodeText) {
        setUnicodeText(unicodeText);
        return this;
    }

    /**
     * @param category
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * @param category
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plate Category(String category) {
        setUnicodeText(category);
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
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getPlateTypeConfidence() != null)
            sb.append("PlateTypeConfidence: ").append(getPlateTypeConfidence()).append(",");
        if (getPositionConfidence() != null)
            sb.append("PositionConfidence: ").append(getPositionConfidence()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getPlateChars() != null)
            sb.append("PlateChars: ").append(getPlateChars()).append(",");
        if (getPlateROI() != null)
            sb.append("PlateROI: ").append(getPlateROI()).append(",");
        if (getPlateType() != null)
            sb.append("PlateType: ").append(getPlateType()).append(",");
        if (getProctime() != null)
            sb.append("Proctime: ").append(getProctime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUnicodeText() != null)
            sb.append("UnicodeText: ").append(getUnicodeText());
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Plate == false)
            return false;
        Plate other = (Plate) obj;
        if (other.getBgcolor() == null ^ this.getBgcolor() == null)
            return false;
        if (other.getBgcolor() != null && other.getBgcolor().equals(this.getBgcolor()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getPlateTypeConfidence() == null ^ this.getPlateTypeConfidence() == null)
            return false;
        if (other.getPlateTypeConfidence() != null && other.getPlateTypeConfidence().equals(this.getPlateTypeConfidence()) == false)
            return false;
        if (other.getPositionConfidence() == null ^ this.getPositionConfidence() == null)
            return false;
        if (other.getPositionConfidence() != null && other.getPositionConfidence().equals(this.getPositionConfidence()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getPlateChars() == null ^ this.getPlateChars() == null)
            return false;
        if (other.getPlateChars() != null && other.getPlateChars().equals(this.getPlateChars()) == false)
            return false;
        if (other.getPlateROI() == null ^ this.getPlateROI() == null)
            return false;
        if (other.getPlateROI() != null && other.getPlateROI().equals(this.getPlateROI()) == false)
            return false;
        if (other.getPlateType() == null ^ this.getPlateType() == null)
            return false;
        if (other.getPlateType() != null && other.getPlateType().equals(this.getPlateType()) == false)
            return false;
        if (other.getProctime() == null ^ this.getProctime() == null)
            return false;
        if (other.getProctime() != null && other.getProctime().equals(this.getProctime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUnicodeText() == null ^ this.getUnicodeText() == null)
            return false;
        if (other.getUnicodeText() != null && other.getUnicodeText().equals(this.getUnicodeText()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBgcolor() == null) ? 0 : getBgcolor().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getPlateTypeConfidence() == null) ? 0 : getPlateTypeConfidence().hashCode());
        hashCode = prime * hashCode + ((getPositionConfidence() == null) ? 0 : getPositionConfidence().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getPlateChars() == null) ? 0 : getPlateChars().hashCode());
        hashCode = prime * hashCode + ((getPlateROI() == null) ? 0 : getPlateROI().hashCode());
        hashCode = prime * hashCode + ((getPlateType() == null) ? 0 : getPlateType().hashCode());
        hashCode = prime * hashCode + ((getProctime() == null) ? 0 : getProctime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUnicodeText() == null) ? 0 : getUnicodeText().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public Plate clone() {
        try {
            return (Plate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.PlateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
