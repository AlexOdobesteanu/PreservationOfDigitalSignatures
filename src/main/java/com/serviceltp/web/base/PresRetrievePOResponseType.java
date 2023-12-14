
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
    "optOut",
    "result",
    "reqId",
    "po"
})
@Generated("jsonschema2pojo")
public class PresRetrievePOResponseType {

    @JsonProperty("optOut")
    private DsbOptionalOutputsType optOut;
    @JsonProperty("result")
    private DsbResultType result;
    @JsonProperty("reqId")
    private String reqId;
    @JsonProperty("po")
    private List<PresPOType> po = new ArrayList<PresPOType>();
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
        sb.append(PresRetrievePOResponseType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.optOut == null)? 0 :this.optOut.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        result = ((result* 31)+((this.po == null)? 0 :this.po.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresRetrievePOResponseType) == false) {
            return false;
        }
        PresRetrievePOResponseType rhs = ((PresRetrievePOResponseType) other);
        return ((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.optOut == rhs.optOut)||((this.optOut!= null)&&this.optOut.equals(rhs.optOut))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))))&&((this.po == rhs.po)||((this.po!= null)&&this.po.equals(rhs.po))));
    }

}
