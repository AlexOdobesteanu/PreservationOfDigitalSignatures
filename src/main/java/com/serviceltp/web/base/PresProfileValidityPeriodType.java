
package com.serviceltp.web.base;

import java.util.Date;
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
    "vfrom",
    "vuntl"
})
@Generated("jsonschema2pojo")
public class PresProfileValidityPeriodType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vfrom")
    private Date vfrom;
    @JsonProperty("vuntl")
    private Date vuntl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public PresProfileValidityPeriodType(Date vfrom, Date vuntl, Map<String, Object> additionalProperties) {
        this.vfrom = vfrom;
        this.vuntl = vuntl;
        this.additionalProperties = additionalProperties;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vfrom")
    public Date getVfrom() {
        return vfrom;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vfrom")
    public void setVfrom(Date vfrom) {
        this.vfrom = vfrom;
    }

    @JsonProperty("vuntl")
    public Date getVuntl() {
        return vuntl;
    }

    @JsonProperty("vuntl")
    public void setVuntl(Date vuntl) {
        this.vuntl = vuntl;
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
        sb.append(PresProfileValidityPeriodType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vfrom");
        sb.append('=');
        sb.append(((this.vfrom == null)?"<null>":this.vfrom));
        sb.append(',');
        sb.append("vuntl");
        sb.append('=');
        sb.append(((this.vuntl == null)?"<null>":this.vuntl));
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
        result = ((result* 31)+((this.vfrom == null)? 0 :this.vfrom.hashCode()));
        result = ((result* 31)+((this.vuntl == null)? 0 :this.vuntl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresProfileValidityPeriodType) == false) {
            return false;
        }
        PresProfileValidityPeriodType rhs = ((PresProfileValidityPeriodType) other);
        return ((((this.vfrom == rhs.vfrom)||((this.vfrom!= null)&&this.vfrom.equals(rhs.vfrom)))&&((this.vuntl == rhs.vuntl)||((this.vuntl!= null)&&this.vuntl.equals(rhs.vuntl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
