
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
    "optOut",
    "result",
    "reqId",
    "valRep",
    "poe"
})
@Generated("jsonschema2pojo")
public class PresValidateEvidenceResponseType {

    @JsonProperty("optOut")
    private DsbOptionalOutputsType optOut;
    @JsonProperty("result")
    private DsbResultType result;
    @JsonProperty("reqId")
    private String reqId;
    @JsonProperty("valRep")
    private PresPOType valRep;
    @JsonProperty("poe")
    private Date poe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("optOut")
    public DsbOptionalOutputsType getOptOut() {
        return optOut;
    }

    @JsonProperty("optOut")
    public void setOptOut(DsbOptionalOutputsType optOut) {
        this.optOut = optOut;
    }

    @JsonProperty("result")
    public DsbResultType getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(DsbResultType result) {
        this.result = result;
    }

    @JsonProperty("reqId")
    public String getReqId() {
        return reqId;
    }

    @JsonProperty("reqId")
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    @JsonProperty("valRep")
    public PresPOType getValRep() {
        return valRep;
    }

    @JsonProperty("valRep")
    public void setValRep(PresPOType valRep) {
        this.valRep = valRep;
    }

    @JsonProperty("poe")
    public Date getPoe() {
        return poe;
    }

    @JsonProperty("poe")
    public void setPoe(Date poe) {
        this.poe = poe;
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
        sb.append(PresValidateEvidenceResponseType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optOut");
        sb.append('=');
        sb.append(((this.optOut == null)?"<null>":this.optOut));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
        sb.append(',');
        sb.append("valRep");
        sb.append('=');
        sb.append(((this.valRep == null)?"<null>":this.valRep));
        sb.append(',');
        sb.append("poe");
        sb.append('=');
        sb.append(((this.poe == null)?"<null>":this.poe));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.optOut == null)? 0 :this.optOut.hashCode()));
        result = ((result* 31)+((this.valRep == null)? 0 :this.valRep.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        result = ((result* 31)+((this.poe == null)? 0 :this.poe.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresValidateEvidenceResponseType) == false) {
            return false;
        }
        PresValidateEvidenceResponseType rhs = ((PresValidateEvidenceResponseType) other);
        return (((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.optOut == rhs.optOut)||((this.optOut!= null)&&this.optOut.equals(rhs.optOut))))&&((this.valRep == rhs.valRep)||((this.valRep!= null)&&this.valRep.equals(rhs.valRep))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))))&&((this.poe == rhs.poe)||((this.poe!= null)&&this.poe.equals(rhs.poe))));
    }

}
