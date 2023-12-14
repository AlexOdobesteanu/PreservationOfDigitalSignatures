
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
    "fid",
    "spec",
    "desc",
    "trfo",
    "format",
    "ext",
    "def"
})
@Generated("jsonschema2pojo")
public class MdFormatType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fid")
    private String fid;
    @JsonProperty("spec")
    private String spec;
    @JsonProperty("desc")
    private List<DsbInternationalStringType__1> desc = new ArrayList<DsbInternationalStringType__1>();
    @JsonProperty("trfo")
    private DsigrwTransformsType__1 trfo;
    @JsonProperty("format")
    private List<MdParameterType> format = new ArrayList<MdParameterType>();
    @JsonProperty("ext")
    private List<DsbAnyType__1> ext = new ArrayList<DsbAnyType__1>();
    @JsonProperty("def")
    private Boolean def = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fid")
    public String getFid() {
        return fid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fid")
    public void setFid(String fid) {
        this.fid = fid;
    }

    @JsonProperty("spec")
    public String getSpec() {
        return spec;
    }

    @JsonProperty("spec")
    public void setSpec(String spec) {
        this.spec = spec;
    }

    @JsonProperty("desc")
    public List<DsbInternationalStringType__1> getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(List<DsbInternationalStringType__1> desc) {
        this.desc = desc;
    }

    @JsonProperty("trfo")
    public DsigrwTransformsType__1 getTrfo() {
        return trfo;
    }

    @JsonProperty("trfo")
    public void setTrfo(DsigrwTransformsType__1 trfo) {
        this.trfo = trfo;
    }

    @JsonProperty("format")
    public List<MdParameterType> getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(List<MdParameterType> format) {
        this.format = format;
    }

    @JsonProperty("ext")
    public List<DsbAnyType__1> getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(List<DsbAnyType__1> ext) {
        this.ext = ext;
    }

    @JsonProperty("def")
    public Boolean getDef() {
        return def;
    }

    @JsonProperty("def")
    public void setDef(Boolean def) {
        this.def = def;
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
        sb.append(MdFormatType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fid");
        sb.append('=');
        sb.append(((this.fid == null)?"<null>":this.fid));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("trfo");
        sb.append('=');
        sb.append(((this.trfo == null)?"<null>":this.trfo));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("ext");
        sb.append('=');
        sb.append(((this.ext == null)?"<null>":this.ext));
        sb.append(',');
        sb.append("def");
        sb.append('=');
        sb.append(((this.def == null)?"<null>":this.def));
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
        result = ((result* 31)+((this.fid == null)? 0 :this.fid.hashCode()));
        result = ((result* 31)+((this.ext == null)? 0 :this.ext.hashCode()));
        result = ((result* 31)+((this.trfo == null)? 0 :this.trfo.hashCode()));
        result = ((result* 31)+((this.def == null)? 0 :this.def.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MdFormatType) == false) {
            return false;
        }
        MdFormatType rhs = ((MdFormatType) other);
        return (((((((((this.fid == rhs.fid)||((this.fid!= null)&&this.fid.equals(rhs.fid)))&&((this.ext == rhs.ext)||((this.ext!= null)&&this.ext.equals(rhs.ext))))&&((this.trfo == rhs.trfo)||((this.trfo!= null)&&this.trfo.equals(rhs.trfo))))&&((this.def == rhs.def)||((this.def!= null)&&this.def.equals(rhs.def))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
