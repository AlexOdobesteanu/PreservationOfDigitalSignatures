
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
    "policy",
    "other"
})
@Generated("jsonschema2pojo")
public class DsbOptionalOutputsType {

    @JsonProperty("policy")
    private List<String> policy = new ArrayList<String>();
    @JsonProperty("other")
    private List<DsbAnyType> other = new ArrayList<DsbAnyType>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("policy")
    public List<String> getPolicy() {
        return policy;
    }

    @JsonProperty("policy")
    public void setPolicy(List<String> policy) {
        this.policy = policy;
    }

    @JsonProperty("other")
    public List<DsbAnyType> getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(List<DsbAnyType> other) {
        this.other = other;
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
        sb.append(DsbOptionalOutputsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("other");
        sb.append('=');
        sb.append(((this.other == null)?"<null>":this.other));
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
        result = ((result* 31)+((this.other == null)? 0 :this.other.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsbOptionalOutputsType) == false) {
            return false;
        }
        DsbOptionalOutputsType rhs = ((DsbOptionalOutputsType) other);
        return ((((this.other == rhs.other)||((this.other!= null)&&this.other.equals(rhs.other)))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
