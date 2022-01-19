/**
 * 
 */
package com.adaptiverecognition.anprcloud.client.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 *
 * @see
 * <a href="http://docs.aws.amazon.com/goto/WebAPI/ol6anslmcc-2020-04-27T16:19:44Z/process" target="_top">AWS
 * API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ANPRCloudResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Answer answer;

    /**
     * @param answer
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    /**
     * @return
     */
    public Answer getAnswer() {
        return this.answer;
    }

    /**
     * @param answer
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudResult answer(Answer answer) {
        setAnswer(answer);
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
        if (getAnswer() != null) {
            sb.append("Answer: ").append(getAnswer());
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

        if (obj instanceof ANPRCloudResult == false) {
            return false;
        }
        ANPRCloudResult other = (ANPRCloudResult) obj;
        if (other.getAnswer() == null ^ this.getAnswer() == null) {
            return false;
        }
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return hashCode;
    }

    @Override
    public ANPRCloudResult clone() {
        try {
            return (ANPRCloudResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
