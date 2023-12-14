
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
    "optIn",
    "reqId",
    "poId",
    "mod",
    "crn",
    "reason"
})
@Generated("jsonschema2pojo")
public class PresDeletePOType {

    @JsonProperty("optIn")
    private DsbOptionalInputsType optIn;
    @JsonProperty("reqId")
    private String reqId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("poId")
    private String poId;
    @JsonProperty("mod")
    private String mod;
    @JsonProperty("crn")
    private String crn;
    @JsonProperty("reason")
    private String reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("optIn")
    public DsbOptionalInputsType getOptIn() {
        return optIn;
    }

    @JsonProperty("optIn")
    public void setOptIn(DsbOptionalInputsType optIn) {
        this.optIn = optIn;
    }

    @JsonProperty("reqId")
    public String getReqId() {
        return reqId;
    }

    @JsonProperty("reqId")
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("poId")
    public String getPoId() {
        return poId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("poId")
    public void setPoId(String poId) {
        this.poId = poId;
    }

    @JsonProperty("mod")
    public String getMod() {
        return mod;
    }

    @JsonProperty("mod")
    public void setMod(String mod) {
        this.mod = mod;
    }

    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
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
        sb.append(PresDeletePOType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optIn");
        sb.append('=');
        sb.append(((this.optIn == null)?"<null>":this.optIn));
        sb.append(',');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
        sb.append(',');
        sb.append("poId");
        sb.append('=');
        sb.append(((this.poId == null)?"<null>":this.poId));
        sb.append(',');
        sb.append("mod");
        sb.append('=');
        sb.append(((this.mod == null)?"<null>":this.mod));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.mod == null)? 0 :this.mod.hashCode()));
        result = ((result* 31)+((this.optIn == null)? 0 :this.optIn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.poId == null)? 0 :this.poId.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresDeletePOType) == false) {
            return false;
        }
        PresDeletePOType rhs = ((PresDeletePOType) other);
        return ((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.mod == rhs.mod)||((this.mod!= null)&&this.mod.equals(rhs.mod))))&&((this.optIn == rhs.optIn)||((this.optIn!= null)&&this.optIn.equals(rhs.optIn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.poId == rhs.poId)||((this.poId!= null)&&this.poId.equals(rhs.poId))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
