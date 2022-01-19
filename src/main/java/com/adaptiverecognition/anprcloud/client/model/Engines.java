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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-eu-2021-05-26T14:28:28Z/Engines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Engines implements Serializable, Cloneable, StructuredPojo {

    private String anpr;

    private String mmr;

    /**
     * @param anpr
     */

    public void setAnpr(String anpr) {
        this.anpr = anpr;
    }

    /**
     * @return
     */

    public String getAnpr() {
        return this.anpr;
    }

    /**
     * @param anpr
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engines anpr(String anpr) {
        setAnpr(anpr);
        return this;
    }

    /**
     * @param mmr
     */

    public void setMmr(String mmr) {
        this.mmr = mmr;
    }

    /**
     * @return
     */

    public String getMmr() {
        return this.mmr;
    }

    /**
     * @param mmr
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Engines mmr(String mmr) {
        setMmr(mmr);
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
        if (getAnpr() != null)
            sb.append("Anpr: ").append(getAnpr()).append(",");
        if (getMmr() != null)
            sb.append("Mmr: ").append(getMmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Engines == false)
            return false;
        Engines other = (Engines) obj;
        if (other.getAnpr() == null ^ this.getAnpr() == null)
            return false;
        if (other.getAnpr() != null && other.getAnpr().equals(this.getAnpr()) == false)
            return false;
        if (other.getMmr() == null ^ this.getMmr() == null)
            return false;
        if (other.getMmr() != null && other.getMmr().equals(this.getMmr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnpr() == null) ? 0 : getAnpr().hashCode());
        hashCode = prime * hashCode + ((getMmr() == null) ? 0 : getMmr().hashCode());
        return hashCode;
    }

    @Override
    public Engines clone() {
        try {
            return (Engines) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.adaptiverecognition.anprcloud.client.model.transform.EnginesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
