
package com.serviceltp.web.base;

import java.util.LinkedHashMap;
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
    "alg",
    "val"
})
@Generated("jsonschema2pojo")
public class DsbDigestInfoType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    private String alg;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("val")
    private String val;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public String getAlg() {
        return alg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public void setAlg(String alg) {
        this.alg = alg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("val")
    public String getVal() {
        return val;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("val")
    public void setVal(String val) {
        this.val = val;
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
        sb.append(DsbDigestInfoType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alg");
        sb.append('=');
        sb.append(((this.alg == null)?"<null>":this.alg));
        sb.append(',');
        sb.append("val");
        sb.append('=');
        sb.append(((this.val == null)?"<null>":this.val));
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
        result = ((result* 31)+((this.val == null)? 0 :this.val.hashCode()));
        result = ((result* 31)+((this.alg == null)? 0 :this.alg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsbDigestInfoType) == false) {
            return false;
        }
        DsbDigestInfoType rhs = ((DsbDigestInfoType) other);
        return ((((this.val == rhs.val)||((this.val!= null)&&this.val.equals(rhs.val)))&&((this.alg == rhs.alg)||((this.alg!= null)&&this.alg.equals(rhs.alg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
