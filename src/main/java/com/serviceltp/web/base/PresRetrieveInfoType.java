
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
    "pro",
    "stat"
})
@Generated("jsonschema2pojo")
public class PresRetrieveInfoType {

    @JsonProperty("optIn")
    private DsbOptionalInputsType optIn;
    @JsonProperty("reqId")
    private String reqId;
    @JsonProperty("pro")
    private String pro;
    @JsonProperty("stat")
    private String stat;
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

    @JsonProperty("pro")
    public String getPro() {
        return pro;
    }

    @JsonProperty("pro")
    public void setPro(String pro) {
        this.pro = pro;
    }

    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
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
        sb.append(PresRetrieveInfoType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("stat");
        sb.append('=');
        sb.append(((this.stat == null)?"<null>":this.stat));
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
        result = ((result* 31)+((this.stat == null)? 0 :this.stat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pro == null)? 0 :this.pro.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresRetrieveInfoType) == false) {
            return false;
        }
        PresRetrieveInfoType rhs = ((PresRetrieveInfoType) other);
        return ((((((this.optIn == rhs.optIn)||((this.optIn!= null)&&this.optIn.equals(rhs.optIn)))&&((this.stat == rhs.stat)||((this.stat!= null)&&this.stat.equals(rhs.stat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pro == rhs.pro)||((this.pro!= null)&&this.pro.equals(rhs.pro))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
