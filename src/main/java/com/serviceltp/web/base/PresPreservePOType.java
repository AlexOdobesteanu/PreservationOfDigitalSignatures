
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
    "pro",
    "po"
})
@Generated("jsonschema2pojo")
public class PresPreservePOType {

    @JsonProperty("optIn")
    private DsbOptionalInputsType optIn;
    @JsonProperty("reqId")
    private String reqId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pro")
    private String pro;
    @JsonProperty("po")
    private List<PresPOType> po = new ArrayList<PresPOType>();
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
    @JsonProperty("pro")
    public String getPro() {
        return pro;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pro")
    public void setPro(String pro) {
        this.pro = pro;
    }

    @JsonProperty("po")
    public List<PresPOType> getPo() {
        return po;
    }

    @JsonProperty("po")
    public void setPo(List<PresPOType> po) {
        this.po = po;
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
        sb.append(PresPreservePOType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optIn");
        sb.append('=');
        sb.append(((this.optIn == null)?"<null>":this.optIn));
        sb.append(',');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
        sb.append(',');
        sb.append("pro");
        sb.append('=');
        sb.append(((this.pro == null)?"<null>":this.pro));
        sb.append(',');
        sb.append("po");
        sb.append('=');
        sb.append(((this.po == null)?"<null>":this.po));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pro == null)? 0 :this.pro.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        result = ((result* 31)+((this.po == null)? 0 :this.po.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresPreservePOType) == false) {
            return false;
        }
        PresPreservePOType rhs = ((PresPreservePOType) other);
        return ((((((this.optIn == rhs.optIn)||((this.optIn!= null)&&this.optIn.equals(rhs.optIn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pro == rhs.pro)||((this.pro!= null)&&this.pro.equals(rhs.pro))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))))&&((this.po == rhs.po)||((this.po!= null)&&this.po.equals(rhs.po))));
    }

}
