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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/__VehiclesElement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VehiclesElement implements Serializable, Cloneable, StructuredPojo {

    private Mmr mmr;

    private Plate plate;

    /**
     * @param mmr
     */

    public void setMmr(Mmr mmr) {
        this.mmr = mmr;
    }

    /**
     * @return
     */

    public Mmr getMmr() {
        return this.mmr;
    }

    /**
     * @param mmr
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehiclesElement mmr(Mmr mmr) {
        setMmr(mmr);
        return this;
    }

    /**
     * @param plate
     */

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    /**
     * @return
     */

    public Plate getPlate() {
        return this.plate;
    }

    /**
     * @param plate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehiclesElement plate(Plate plate) {
        setPlate(plate);
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
        if (getMmr() != null)
            sb.append("Mmr: ").append(getMmr()).append(",");
        if (getPlate() != null)
            sb.append("Plate: ").append(getPlate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VehiclesElement == false)
            return false;
        VehiclesElement other = (VehiclesElement) obj;
        if (other.getMmr() == null ^ this.getMmr() == null)
            return false;
        if (other.getMmr() != null && other.getMmr().equals(this.getMmr()) == false)
            return false;
        if (other.getPlate() == null ^ this.getPlate() == null)
            return false;
        if (other.getPlate() != null && other.getPlate().equals(this.getPlate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMmr() == null) ? 0 : getMmr().hashCode());
        hashCode = prime * hashCode + ((getPlate() == null) ? 0 : getPlate().hashCode());
        return hashCode;
    }

    @Override
    public VehiclesElement clone() {
        try {
            return (VehiclesElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.VehiclesElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
