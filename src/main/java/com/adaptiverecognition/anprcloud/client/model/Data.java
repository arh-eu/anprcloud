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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/Data" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Data implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<VehiclesElement> vehicles;

    /**
     * @return
     */

    public java.util.List<VehiclesElement> getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles
     */

    public void setVehicles(java.util.Collection<VehiclesElement> vehicles) {
        if (vehicles == null) {
            this.vehicles = null;
            return;
        }

        this.vehicles = new java.util.ArrayList<VehiclesElement>(vehicles);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVehicles(java.util.Collection)} or {@link #withVehicles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param vehicles
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Data vehicles(VehiclesElement... vehicles) {
        if (this.vehicles == null) {
            setVehicles(new java.util.ArrayList<VehiclesElement>(vehicles.length));
        }
        for (VehiclesElement ele : vehicles) {
            this.vehicles.add(ele);
        }
        return this;
    }

    /**
     * @param vehicles
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Data vehicles(java.util.Collection<VehiclesElement> vehicles) {
        setVehicles(vehicles);
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
        if (getVehicles() != null)
            sb.append("Vehicles: ").append(getVehicles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Data == false)
            return false;
        Data other = (Data) obj;
        if (other.getVehicles() == null ^ this.getVehicles() == null)
            return false;
        if (other.getVehicles() != null && other.getVehicles().equals(this.getVehicles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicles() == null) ? 0 : getVehicles().hashCode());
        return hashCode;
    }

    @Override
    public Data clone() {
        try {
            return (Data) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.DataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
