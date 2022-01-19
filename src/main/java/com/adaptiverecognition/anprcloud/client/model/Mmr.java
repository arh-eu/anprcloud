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
 * @see
 * <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/Mmr" target="_top">AWS
 * API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mmr implements Serializable, Cloneable, StructuredPojo {

    private String category;

    private Integer categoryConfidence;

    private Color color;

    private Integer colorConfidence;

    private String make;

    private Integer makeAndModelConfidence;

    private String model;

    private Integer proctime;

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
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr category(String category) {
        setCategory(category);
        return this;
    }

    /**
     * @param categoryConfidence
     */
    public void setCategoryConfidence(Integer categoryConfidence) {
        this.categoryConfidence = categoryConfidence;
    }

    /**
     * @return
     */
    public Integer getCategoryConfidence() {
        return this.categoryConfidence;
    }

    /**
     * @param categoryConfidence
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr categoryConfidence(Integer categoryConfidence) {
        setCategoryConfidence(categoryConfidence);
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
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr color(Color color) {
        setColor(color);
        return this;
    }

    /**
     * @param colorConfidence
     */
    public void setColorConfidence(Integer colorConfidence) {
        this.colorConfidence = colorConfidence;
    }

    /**
     * @return
     */
    public Integer getColorConfidence() {
        return this.colorConfidence;
    }

    /**
     * @param colorConfidence
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr colorConfidence(Integer colorConfidence) {
        setColorConfidence(colorConfidence);
        return this;
    }

    /**
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return
     */
    public String getMake() {
        return this.make;
    }

    /**
     * @param make
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr make(String make) {
        setMake(make);
        return this;
    }

    /**
     * @param makeAndModelConfidence
     */
    public void setMakeAndModelConfidence(Integer makeAndModelConfidence) {
        this.makeAndModelConfidence = makeAndModelConfidence;
    }

    /**
     * @return
     */
    public Integer getMakeAndModelConfidence() {
        return this.makeAndModelConfidence;
    }

    /**
     * @param makeAndModelConfidence
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr makeAndModelConfidence(Integer makeAndModelConfidence) {
        setMakeAndModelConfidence(makeAndModelConfidence);
        return this;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @param model
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr model(String model) {
        setModel(model);
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
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public Mmr proctime(Integer proctime) {
        setProctime(proctime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for
     * testing and debugging. Sensitive data will be redacted from this string
     * using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCategory() != null) {
            sb.append("Category: ").append(getCategory()).append(",");
        }
        if (getCategoryConfidence() != null) {
            sb.append("CategoryConfidence: ").append(getCategoryConfidence()).append(",");
        }
        if (getColor() != null) {
            sb.append("Color: ").append(getColor()).append(",");
        }
        if (getColorConfidence() != null) {
            sb.append("ColorConfidence: ").append(getColorConfidence()).append(",");
        }
        if (getMake() != null) {
            sb.append("Make: ").append(getMake()).append(",");
        }
        if (getMakeAndModelConfidence() != null) {
            sb.append("MakeAndModelConfidence: ").append(getMakeAndModelConfidence()).append(",");
        }
        if (getModel() != null) {
            sb.append("Model: ").append(getModel()).append(",");
        }
        if (getProctime() != null) {
            sb.append("Proctime: ").append(getProctime()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof Mmr == false) {
            return false;
        }
        Mmr other = (Mmr) obj;
        if (other.getCategory() == null ^ this.getCategory() == null) {
            return false;
        }
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false) {
            return false;
        }
        if (other.getCategoryConfidence() == null ^ this.getCategoryConfidence() == null) {
            return false;
        }
        if (other.getCategoryConfidence() != null && other.getCategoryConfidence().equals(this.getCategoryConfidence()) == false) {
            return false;
        }
        if (other.getColor() == null ^ this.getColor() == null) {
            return false;
        }
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false) {
            return false;
        }
        if (other.getColorConfidence() == null ^ this.getColorConfidence() == null) {
            return false;
        }
        if (other.getColorConfidence() != null && other.getColorConfidence().equals(this.getColorConfidence()) == false) {
            return false;
        }
        if (other.getMake() == null ^ this.getMake() == null) {
            return false;
        }
        if (other.getMake() != null && other.getMake().equals(this.getMake()) == false) {
            return false;
        }
        if (other.getMakeAndModelConfidence() == null ^ this.getMakeAndModelConfidence() == null) {
            return false;
        }
        if (other.getMakeAndModelConfidence() != null && other.getMakeAndModelConfidence().equals(this.getMakeAndModelConfidence()) == false) {
            return false;
        }
        if (other.getModel() == null ^ this.getModel() == null) {
            return false;
        }
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false) {
            return false;
        }
        if (other.getProctime() == null ^ this.getProctime() == null) {
            return false;
        }
        if (other.getProctime() != null && other.getProctime().equals(this.getProctime()) == false) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCategoryConfidence() == null) ? 0 : getCategoryConfidence().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getColorConfidence() == null) ? 0 : getColorConfidence().hashCode());
        hashCode = prime * hashCode + ((getMake() == null) ? 0 : getMake().hashCode());
        hashCode = prime * hashCode + ((getMakeAndModelConfidence() == null) ? 0 : getMakeAndModelConfidence().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getProctime() == null) ? 0 : getProctime().hashCode());
        return hashCode;
    }

    @Override
    public Mmr clone() {
        try {
            return (Mmr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.MmrMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
