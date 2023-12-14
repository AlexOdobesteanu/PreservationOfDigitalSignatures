
package com.serviceltp.web.base;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
    "maj",
    "min",
    "msg",
    "pRef"
})
@Generated("jsonschema2pojo")
public class DsbResultType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maj")
    private DsbResultType.Maj maj;
    @JsonProperty("min")
    private String min;
    @JsonProperty("msg")
    private DsbInternationalStringType msg;
    @JsonProperty("pRef")
    private String pRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maj")
    public DsbResultType.Maj getMaj() {
        return maj;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maj")
    public void setMaj(DsbResultType.Maj maj) {
        this.maj = maj;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("msg")
    public DsbInternationalStringType getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(DsbInternationalStringType msg) {
        this.msg = msg;
    }

    @JsonProperty("pRef")
    public String getpRef() {
        return pRef;
    }

    @JsonProperty("pRef")
    public void setpRef(String pRef) {
        this.pRef = pRef;
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
        sb.append(DsbResultType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maj");
        sb.append('=');
        sb.append(((this.maj == null)?"<null>":this.maj));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("msg");
        sb.append('=');
        sb.append(((this.msg == null)?"<null>":this.msg));
        sb.append(',');
        sb.append("pRef");
        sb.append('=');
        sb.append(((this.pRef == null)?"<null>":this.pRef));
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
        result = ((result* 31)+((this.msg == null)? 0 :this.msg.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maj == null)? 0 :this.maj.hashCode()));
        result = ((result* 31)+((this.pRef == null)? 0 :this.pRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsbResultType) == false) {
            return false;
        }
        DsbResultType rhs = ((DsbResultType) other);
        return ((((((this.msg == rhs.msg)||((this.msg!= null)&&this.msg.equals(rhs.msg)))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maj == rhs.maj)||((this.maj!= null)&&this.maj.equals(rhs.maj))))&&((this.pRef == rhs.pRef)||((this.pRef!= null)&&this.pRef.equals(rhs.pRef))));
    }

    @Generated("jsonschema2pojo")
    public enum Maj {

        URN_OASIS_NAMES_TC_DSS_1_0_RESULTMAJOR_SUCCESS("urn:oasis:names:tc:dss:1.0:resultmajor:Success"),
        URN_OASIS_NAMES_TC_DSS_1_0_RESULTMAJOR_REQUESTER_ERROR("urn:oasis:names:tc:dss:1.0:resultmajor:RequesterError"),
        URN_OASIS_NAMES_TC_DSS_1_0_RESULTMAJOR_RESPONDER_ERROR("urn:oasis:names:tc:dss:1.0:resultmajor:ResponderError"),
        URN_OASIS_NAMES_TC_DSS_1_0_RESULTMAJOR_INSUFFICIENT_INFORMATION("urn:oasis:names:tc:dss:1.0:resultmajor:InsufficientInformation"),
        URN_OASIS_NAMES_TC_DSS_1_0_PROFILES_ASYNCHRONOUSPROCESSING_RESULTMAJOR_PENDING("urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:resultmajor:Pending");
        private final String value;
        private final static Map<String, DsbResultType.Maj> CONSTANTS = new HashMap<String, DsbResultType.Maj>();

        static {
            for (DsbResultType.Maj c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Maj(String value) {
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
        public static DsbResultType.Maj fromValue(String value) {
            DsbResultType.Maj constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
