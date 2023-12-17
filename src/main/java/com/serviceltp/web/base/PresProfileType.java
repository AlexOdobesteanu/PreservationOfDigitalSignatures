
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
    "pid",
    "spec",
    "description",
    "op",
    "pol",
    "ext",
    "sid",
    "pvp",
    "psm",
    "pg",
    "ef",
    "eed",
    "perp"
})
@Generated("jsonschema2pojo")
public class PresProfileType {

    @JsonProperty("pid")
    private String pid;
    @JsonProperty("spec")
    private List<String> spec = new ArrayList<String>();
    @JsonProperty("description")
    private List<DsbInternationalStringType> description = new ArrayList<DsbInternationalStringType>();
    @JsonProperty("op")
    private List<MdOperationType> op = new ArrayList<MdOperationType>();
    @JsonProperty("pol")
    private List<MdPolicyType> pol = new ArrayList<MdPolicyType>();
    @JsonProperty("ext")
    private List<MdExtensionType> ext = new ArrayList<MdExtensionType>();
    @JsonProperty("sid")
    private String sid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pvp")
    private PresProfileValidityPeriodType pvp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("psm")
    private String psm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pg")
    private List<String> pg = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ef")
    private List<MdFormatType> ef = new ArrayList<MdFormatType>();
    @JsonProperty("eed")
    private String eed;
    @JsonProperty("perp")
    private String perp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public PresProfileType(String pid, List<String> spec, List<DsbInternationalStringType> description, List<MdOperationType> op, List<MdPolicyType> pol, List<MdExtensionType> ext, String sid, PresProfileValidityPeriodType pvp, String psm, List<String> pg, List<MdFormatType> ef, String eed, String perp, Map<String, Object> additionalProperties) {
        this.pid = pid;
        this.spec = spec;
        this.description = description;
        this.op = op;
        this.pol = pol;
        this.ext = ext;
        this.sid = sid;
        this.pvp = pvp;
        this.psm = psm;
        this.pg = pg;
        this.ef = ef;
        this.eed = eed;
        this.perp = perp;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pid")
    public String getPid() {
        return pid;
    }

    @JsonProperty("pid")
    public void setPid(String pid) {
        this.pid = pid;
    }

    @JsonProperty("spec")
    public List<String> getSpec() {
        return spec;
    }

    @JsonProperty("spec")
    public void setSpec(List<String> spec) {
        this.spec = spec;
    }

    @JsonProperty("description")
    public List<DsbInternationalStringType> getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(List<DsbInternationalStringType> description) {
        this.description = description;
    }

    @JsonProperty("op")
    public List<MdOperationType> getOp() {
        return op;
    }

    @JsonProperty("op")
    public void setOp(List<MdOperationType> op) {
        this.op = op;
    }

    @JsonProperty("pol")
    public List<MdPolicyType> getPol() {
        return pol;
    }

    @JsonProperty("pol")
    public void setPol(List<MdPolicyType> pol) {
        this.pol = pol;
    }

    @JsonProperty("ext")
    public List<MdExtensionType> getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(List<MdExtensionType> ext) {
        this.ext = ext;
    }

    @JsonProperty("sid")
    public String getSid() {
        return sid;
    }

    @JsonProperty("sid")
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pvp")
    public PresProfileValidityPeriodType getPvp() {
        return pvp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pvp")
    public void setPvp(PresProfileValidityPeriodType pvp) {
        this.pvp = pvp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("psm")
    public String getPsm() {
        return psm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("psm")
    public void setPsm(String psm) {
        this.psm = psm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pg")
    public List<String> getPg() {
        return pg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pg")
    public void setPg(List<String> pg) {
        this.pg = pg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ef")
    public List<MdFormatType> getEf() {
        return ef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ef")
    public void setEf(List<MdFormatType> ef) {
        this.ef = ef;
    }

    @JsonProperty("eed")
    public String getEed() {
        return eed;
    }

    @JsonProperty("eed")
    public void setEed(String eed) {
        this.eed = eed;
    }

    @JsonProperty("perp")
    public String getPerp() {
        return perp;
    }

    @JsonProperty("perp")
    public void setPerp(String perp) {
        this.perp = perp;
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
        sb.append(PresProfileType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pid");
        sb.append('=');
        sb.append(((this.pid == null)?"<null>":this.pid));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("op");
        sb.append('=');
        sb.append(((this.op == null)?"<null>":this.op));
        sb.append(',');
        sb.append("pol");
        sb.append('=');
        sb.append(((this.pol == null)?"<null>":this.pol));
        sb.append(',');
        sb.append("ext");
        sb.append('=');
        sb.append(((this.ext == null)?"<null>":this.ext));
        sb.append(',');
        sb.append("sid");
        sb.append('=');
        sb.append(((this.sid == null)?"<null>":this.sid));
        sb.append(',');
        sb.append("pvp");
        sb.append('=');
        sb.append(((this.pvp == null)?"<null>":this.pvp));
        sb.append(',');
        sb.append("psm");
        sb.append('=');
        sb.append(((this.psm == null)?"<null>":this.psm));
        sb.append(',');
        sb.append("pg");
        sb.append('=');
        sb.append(((this.pg == null)?"<null>":this.pg));
        sb.append(',');
        sb.append("ef");
        sb.append('=');
        sb.append(((this.ef == null)?"<null>":this.ef));
        sb.append(',');
        sb.append("eed");
        sb.append('=');
        sb.append(((this.eed == null)?"<null>":this.eed));
        sb.append(',');
        sb.append("perp");
        sb.append('=');
        sb.append(((this.perp == null)?"<null>":this.perp));
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
        result = ((result* 31)+((this.ext == null)? 0 :this.ext.hashCode()));
        result = ((result* 31)+((this.op == null)? 0 :this.op.hashCode()));
        result = ((result* 31)+((this.ef == null)? 0 :this.ef.hashCode()));
        result = ((result* 31)+((this.eed == null)? 0 :this.eed.hashCode()));
        result = ((result* 31)+((this.perp == null)? 0 :this.perp.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.pid == null)? 0 :this.pid.hashCode()));
        result = ((result* 31)+((this.pvp == null)? 0 :this.pvp.hashCode()));
        result = ((result* 31)+((this.psm == null)? 0 :this.psm.hashCode()));
        result = ((result* 31)+((this.pol == null)? 0 :this.pol.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.sid == null)? 0 :this.sid.hashCode()));
        result = ((result* 31)+((this.pg == null)? 0 :this.pg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresProfileType) == false) {
            return false;
        }
        PresProfileType rhs = ((PresProfileType) other);
        return (((((((((((((((this.ext == rhs.ext)||((this.ext!= null)&&this.ext.equals(rhs.ext)))&&((this.op == rhs.op)||((this.op!= null)&&this.op.equals(rhs.op))))&&((this.ef == rhs.ef)||((this.ef!= null)&&this.ef.equals(rhs.ef))))&&((this.eed == rhs.eed)||((this.eed!= null)&&this.eed.equals(rhs.eed))))&&((this.perp == rhs.perp)||((this.perp!= null)&&this.perp.equals(rhs.perp))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.pid == rhs.pid)||((this.pid!= null)&&this.pid.equals(rhs.pid))))&&((this.pvp == rhs.pvp)||((this.pvp!= null)&&this.pvp.equals(rhs.pvp))))&&((this.psm == rhs.psm)||((this.psm!= null)&&this.psm.equals(rhs.psm))))&&((this.pol == rhs.pol)||((this.pol!= null)&&this.pol.equals(rhs.pol))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.sid == rhs.sid)||((this.sid!= null)&&this.sid.equals(rhs.sid))))&&((this.pg == rhs.pg)||((this.pg!= null)&&this.pg.equals(rhs.pg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
