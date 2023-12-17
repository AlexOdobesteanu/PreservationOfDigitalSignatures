
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
    "polid",
    "polloc"
})
@Generated("jsonschema2pojo")
public class MdPolicyByRefType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polid")
    private String polid;
    @JsonProperty("polloc")
    private String polloc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public MdPolicyByRefType(String polid, String polloc, Map<String, Object> additionalProperties) {
        this.polid = polid;
        this.polloc = polloc;
        this.additionalProperties = additionalProperties;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polid")
    public String getPolid() {
        return polid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polid")
    public void setPolid(String polid) {
        this.polid = polid;
    }

    @JsonProperty("polloc")
    public String getPolloc() {
        return polloc;
    }

    @JsonProperty("polloc")
    public void setPolloc(String polloc) {
        this.polloc = polloc;
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
        sb.append(MdPolicyByRefType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("polid");
        sb.append('=');
        sb.append(((this.polid == null)?"<null>":this.polid));
        sb.append(',');
        sb.append("polloc");
        sb.append('=');
        sb.append(((this.polloc == null)?"<null>":this.polloc));
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
        result = ((result* 31)+((this.polid == null)? 0 :this.polid.hashCode()));
        result = ((result* 31)+((this.polloc == null)? 0 :this.polloc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MdPolicyByRefType) == false) {
            return false;
        }
        MdPolicyByRefType rhs = ((MdPolicyByRefType) other);
        return ((((this.polid == rhs.polid)||((this.polid!= null)&&this.polid.equals(rhs.polid)))&&((this.polloc == rhs.polloc)||((this.polloc!= null)&&this.polloc.equals(rhs.polloc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
