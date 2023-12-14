
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
    "optOut",
    "result",
    "reqId",
    "versionId"
})
@Generated("jsonschema2pojo")
public class PresUpdatePOCResponseType {

    @JsonProperty("optOut")
    private DsbOptionalOutputsType optOut;
    @JsonProperty("result")
    private DsbResultType result;
    @JsonProperty("reqId")
    private String reqId;
    @JsonProperty("versionId")
    private String versionId;
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

    @JsonProperty("versionId")
    public String getVersionId() {
        return versionId;
    }

    @JsonProperty("versionId")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
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
        sb.append(PresUpdatePOCResponseType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("versionId");
        sb.append('=');
        sb.append(((this.versionId == null)?"<null>":this.versionId));
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
        result = ((result* 31)+((this.versionId == null)? 0 :this.versionId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresUpdatePOCResponseType) == false) {
            return false;
        }
        PresUpdatePOCResponseType rhs = ((PresUpdatePOCResponseType) other);
        return ((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.optOut == rhs.optOut)||((this.optOut!= null)&&this.optOut.equals(rhs.optOut))))&&((this.versionId == rhs.versionId)||((this.versionId!= null)&&this.versionId.equals(rhs.versionId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
