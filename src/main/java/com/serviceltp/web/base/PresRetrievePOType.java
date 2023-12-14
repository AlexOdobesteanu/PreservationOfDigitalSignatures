
package com.serviceltp.web.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "optIn",
    "reqId",
    "poId",
    "versionId",
    "sor",
    "poFormat",
    "evFormat"
})
@Generated("jsonschema2pojo")
public class PresRetrievePOType {

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
    @JsonProperty("versionId")
    private List<String> versionId = new ArrayList<String>();
    @JsonProperty("sor")
    private PresRetrievePOType.PresSubjectOfRetrievalType sor;
    @JsonProperty("poFormat")
    private String poFormat;
    @JsonProperty("evFormat")
    private String evFormat;
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

    @JsonProperty("versionId")
    public List<String> getVersionId() {
        return versionId;
    }

    @JsonProperty("versionId")
    public void setVersionId(List<String> versionId) {
        this.versionId = versionId;
    }

    @JsonProperty("sor")
    public PresRetrievePOType.PresSubjectOfRetrievalType getSor() {
        return sor;
    }

    @JsonProperty("sor")
    public void setSor(PresRetrievePOType.PresSubjectOfRetrievalType sor) {
        this.sor = sor;
    }

    @JsonProperty("poFormat")
    public String getPoFormat() {
        return poFormat;
    }

    @JsonProperty("poFormat")
    public void setPoFormat(String poFormat) {
        this.poFormat = poFormat;
    }

    @JsonProperty("evFormat")
    public String getEvFormat() {
        return evFormat;
    }

    @JsonProperty("evFormat")
    public void setEvFormat(String evFormat) {
        this.evFormat = evFormat;
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
        sb.append(PresRetrievePOType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("versionId");
        sb.append('=');
        sb.append(((this.versionId == null)?"<null>":this.versionId));
        sb.append(',');
        sb.append("sor");
        sb.append('=');
        sb.append(((this.sor == null)?"<null>":this.sor));
        sb.append(',');
        sb.append("poFormat");
        sb.append('=');
        sb.append(((this.poFormat == null)?"<null>":this.poFormat));
        sb.append(',');
        sb.append("evFormat");
        sb.append('=');
        sb.append(((this.evFormat == null)?"<null>":this.evFormat));
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
        result = ((result* 31)+((this.versionId == null)? 0 :this.versionId.hashCode()));
        result = ((result* 31)+((this.evFormat == null)? 0 :this.evFormat.hashCode()));
        result = ((result* 31)+((this.sor == null)? 0 :this.sor.hashCode()));
        result = ((result* 31)+((this.optIn == null)? 0 :this.optIn.hashCode()));
        result = ((result* 31)+((this.poFormat == null)? 0 :this.poFormat.hashCode()));
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
        if ((other instanceof PresRetrievePOType) == false) {
            return false;
        }
        PresRetrievePOType rhs = ((PresRetrievePOType) other);
        return (((((((((this.versionId == rhs.versionId)||((this.versionId!= null)&&this.versionId.equals(rhs.versionId)))&&((this.evFormat == rhs.evFormat)||((this.evFormat!= null)&&this.evFormat.equals(rhs.evFormat))))&&((this.sor == rhs.sor)||((this.sor!= null)&&this.sor.equals(rhs.sor))))&&((this.optIn == rhs.optIn)||((this.optIn!= null)&&this.optIn.equals(rhs.optIn))))&&((this.poFormat == rhs.poFormat)||((this.poFormat!= null)&&this.poFormat.equals(rhs.poFormat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.poId == rhs.poId)||((this.poId!= null)&&this.poId.equals(rhs.poId))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

    @Generated("jsonschema2pojo")
    public enum PresSubjectOfRetrievalType {

        PO("PO"),
        EVIDENCE("Evidence"),
        P_OWITH_EMBEDDED_EVIDENCE("POwithEmbeddedEvidence"),
        P_OWITH_DETACHED_EVIDENCE("POwithDetachedEvidence");
        private final String value;
        private final static Map<String, PresRetrievePOType.PresSubjectOfRetrievalType> CONSTANTS = new HashMap<String, PresRetrievePOType.PresSubjectOfRetrievalType>();

        static {
            for (PresRetrievePOType.PresSubjectOfRetrievalType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PresSubjectOfRetrievalType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PresRetrievePOType.PresSubjectOfRetrievalType fromValue(String value) {
            PresRetrievePOType.PresSubjectOfRetrievalType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
