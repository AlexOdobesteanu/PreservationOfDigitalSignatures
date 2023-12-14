
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
    "digVal",
    "ev"
})
@Generated("jsonschema2pojo")
public class PresDigestListType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("digVal")
    private List<String> digVal = new ArrayList<String>();
    @JsonProperty("ev")
    private PresEvidenceType ev;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("digVal")
    public List<String> getDigVal() {
        return digVal;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("digVal")
    public void setDigVal(List<String> digVal) {
        this.digVal = digVal;
    }

    @JsonProperty("ev")
    public PresEvidenceType getEv() {
        return ev;
    }

    @JsonProperty("ev")
    public void setEv(PresEvidenceType ev) {
        this.ev = ev;
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
        sb.append(PresDigestListType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("digVal");
        sb.append('=');
        sb.append(((this.digVal == null)?"<null>":this.digVal));
        sb.append(',');
        sb.append("ev");
        sb.append('=');
        sb.append(((this.ev == null)?"<null>":this.ev));
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
        result = ((result* 31)+((this.ev == null)? 0 :this.ev.hashCode()));
        result = ((result* 31)+((this.digVal == null)? 0 :this.digVal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresDigestListType) == false) {
            return false;
        }
        PresDigestListType rhs = ((PresDigestListType) other);
        return ((((this.ev == rhs.ev)||((this.ev!= null)&&this.ev.equals(rhs.ev)))&&((this.digVal == rhs.digVal)||((this.digVal!= null)&&this.digVal.equals(rhs.digVal))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
