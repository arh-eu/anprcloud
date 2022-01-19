/**
 *
 */
package com.adaptiverecognition.anprcloud.client.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import javax.annotation.Generated;

/**
 *
 * @see
 * <a href="http://docs.aws.amazon.com/goto/WebAPI/ol6anslmcc-2020-04-27T16:19:44Z/process" target="_top">AWS
 * API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ANPRCloudRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    public enum Type {
        ANPR, MMR
    }

    private Integer maxreads;

    private String location;

    private String mimeType;

    private String imageName;

    private long imageSize;

    private InputStream image;

    private Type type = Type.ANPR;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public Type getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public InputStream getImage() {
        return image;
    }

    /**
     * Get the value of imageSize
     *
     * @return the value of imageSize
     */
    public long getImageSize() {
        return imageSize;
    }

    /**
     * Get the value of mimeType
     *
     * @return the value of mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Get the value of imageName
     *
     * @return the value of imageName
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Set the value of image, imageName, and mimeType
     *
     * @param image new value of image
     * @param imageName new value of imageName
     * @param mimeType new value of mimeType
     * @throws java.io.IOException
     */
    public void setImage(InputStream image, String imageName, String mimeType) throws IOException {
        byte[] imageContent = image.readAllBytes();
        this.imageSize = imageContent.length;
        this.image = new ByteArrayInputStream(imageContent);
        this.imageName = imageName;
        this.mimeType = mimeType;
    }

    /**
     * @param maxreads
     */
    public void setMaxreads(Integer maxreads) {
        this.maxreads = maxreads;
    }

    /**
     * @return
     */
    public Integer getMaxreads() {
        return this.maxreads;
    }

    /**
     * @param maxreads
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudRequest maxreads(Integer maxreads) {
        setMaxreads(maxreads);
        return this;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudRequest location(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public ANPRCloudRequest type(Type type) {
        setType(type);
        return this;
    }

    /**
     * @param image
     * @param imageName
     * @param mimeType
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     * @throws java.io.IOException
     */
    public ANPRCloudRequest image(InputStream image, String imageName, String mimeType) throws IOException {
        setImage(image, imageName, mimeType);
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
        if (getType() != null) {
            sb.append("Type: ").append(getType()).append(",");
        }
        if (getMaxreads() != null) {
            sb.append("Maxreads: ").append(getMaxreads()).append(",");
        }
        if (getLocation() != null) {
            sb.append("Location: ").append(getLocation()).append(",");
        }
        if (getImage() != null) {
            sb.append("Image: ").append(getImageName()).append(" (").append(getImageSize()).append(" bytes),");
        }
        if (getMimeType() != null) {
            sb.append("MimeType: ").append(getMimeType());
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

        if (obj instanceof ANPRCloudRequest == false) {
            return false;
        }
        ANPRCloudRequest other = (ANPRCloudRequest) obj;
        if (other.getType() == null ^ this.getType() == null) {
            return false;
        }
        if (other.getType() != null && other.getType().equals(this.getType()) == false) {
            return false;
        }
        if (other.getMaxreads() == null ^ this.getMaxreads() == null) {
            return false;
        }
        if (other.getMaxreads() != null && other.getMaxreads().equals(this.getMaxreads()) == false) {
            return false;
        }
        if (other.getLocation() == null ^ this.getLocation() == null) {
            return false;
        }
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) {
            return false;
        }
        if (other.getImage() == null ^ this.getImage() == null) {
            return false;
        }
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) {
            return false;
        }
        if (other.getImageName() == null ^ this.getImageName() == null) {
            return false;
        }
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false) {
            return false;
        }
        if (other.getMimeType() == null ^ this.getMimeType() == null) {
            return false;
        }
        if (other.getMimeType() != null && other.getMimeType().equals(this.getMimeType()) == false) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxreads() == null) ? 0 : getMaxreads().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getMimeType() == null) ? 0 : getMimeType().hashCode());
        return hashCode;
    }

    @Override
    public ANPRCloudRequest clone() {
        return (ANPRCloudRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig Request configuration.
     * @return This object for method chaining.
     */
    @Override
    public ANPRCloudRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
