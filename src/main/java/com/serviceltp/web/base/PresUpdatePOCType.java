
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
    "optIn",
    "reqId",
    "poId",
    "deltaPoc"
})
@Generated("jsonschema2pojo")
public class PresUpdatePOCType {

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
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deltaPoc")
    private List<PresPOType> deltaPoc = new ArrayList<PresPOType>();
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deltaPoc")
    public List<PresPOType> getDeltaPoc() {
        return deltaPoc;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deltaPoc")
    public void setDeltaPoc(List<PresPOType> deltaPoc) {
        this.deltaPoc = deltaPoc;
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
        sb.append(PresUpdatePOCType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("deltaPoc");
        sb.append('=');
        sb.append(((this.deltaPoc == null)?"<null>":this.deltaPoc));
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
        result = ((result* 31)+((this.optIn == null)? 0 :this.optIn.hashCode()));
        result = ((result* 31)+((this.deltaPoc == null)? 0 :this.deltaPoc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.poId == null)? 0 :this.poId.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresUpdatePOCType) == false) {
            return false;
        }
        PresUpdatePOCType rhs = ((PresUpdatePOCType) other);
        return ((((((this.optIn == rhs.optIn)||((this.optIn!= null)&&this.optIn.equals(rhs.optIn)))&&((this.deltaPoc == rhs.deltaPoc)||((this.deltaPoc!= null)&&this.deltaPoc.equals(rhs.deltaPoc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.poId == rhs.poId)||((this.poId!= null)&&this.poId.equals(rhs.poId))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
