
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
    "time",
    "sub",
    "op",
    "obj",
    "det"
})
@Generated("jsonschema2pojo")
public class PresEventType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    private Date time;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sub")
    private String sub;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("op")
    private String op;
    @JsonProperty("obj")
    private String obj;
    @JsonProperty("det")
    private String det;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    public Date getTime() {
        return time;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time")
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sub")
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("op")
    public String getOp() {
        return op;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    @JsonProperty("obj")
    public String getObj() {
        return obj;
    }

    @JsonProperty("obj")
    public void setObj(String obj) {
        this.obj = obj;
    }

    @JsonProperty("det")
    public String getDet() {
        return det;
    }

    @JsonProperty("det")
    public void setDet(String det) {
        this.det = det;
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
        sb.append(PresEventType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("sub");
        sb.append('=');
        sb.append(((this.sub == null)?"<null>":this.sub));
        sb.append(',');
        sb.append("op");
        sb.append('=');
        sb.append(((this.op == null)?"<null>":this.op));
        sb.append(',');
        sb.append("obj");
        sb.append('=');
        sb.append(((this.obj == null)?"<null>":this.obj));
        sb.append(',');
        sb.append("det");
        sb.append('=');
        sb.append(((this.det == null)?"<null>":this.det));
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
        result = ((result* 31)+((this.sub == null)? 0 :this.sub.hashCode()));
        result = ((result* 31)+((this.op == null)? 0 :this.op.hashCode()));
        result = ((result* 31)+((this.det == null)? 0 :this.det.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.obj == null)? 0 :this.obj.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresEventType) == false) {
            return false;
        }
        PresEventType rhs = ((PresEventType) other);
        return (((((((this.sub == rhs.sub)||((this.sub!= null)&&this.sub.equals(rhs.sub)))&&((this.op == rhs.op)||((this.op!= null)&&this.op.equals(rhs.op))))&&((this.det == rhs.det)||((this.det!= null)&&this.det.equals(rhs.det))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.obj == rhs.obj)||((this.obj!= null)&&this.obj.equals(rhs.obj))));
    }

}
