
package com.serviceltp.web.base;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "di",
    "attURI"
})
@Generated("jsonschema2pojo")
public class DsbAttachmentReferenceType {

    @JsonProperty("di")
    private List<DsbDigestInfoType> di = new ArrayList<DsbDigestInfoType>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attURI")
    private String attURI;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("di")
    public List<DsbDigestInfoType> getDi() {
        return di;
    }

    @JsonProperty("di")
    public void setDi(List<DsbDigestInfoType> di) {
        this.di = di;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attURI")
    public String getAttURI() {
        return attURI;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attURI")
    public void setAttURI(String attURI) {
        this.attURI = attURI;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DsbAttachmentReferenceType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("di");
        sb.append('=');
        sb.append(((this.di == null)?"<null>":this.di));
        sb.append(',');
        sb.append("attURI");
        sb.append('=');
        sb.append(((this.attURI == null)?"<null>":this.attURI));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.di == null)? 0 :this.di.hashCode()));
        result = ((result* 31)+((this.attURI == null)? 0 :this.attURI.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsbAttachmentReferenceType) == false) {
            return false;
        }
        DsbAttachmentReferenceType rhs = ((DsbAttachmentReferenceType) other);
        return ((((this.di == rhs.di)||((this.di!= null)&&this.di.equals(rhs.di)))&&((this.attURI == rhs.attURI)||((this.attURI!= null)&&this.attURI.equals(rhs.attURI))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
