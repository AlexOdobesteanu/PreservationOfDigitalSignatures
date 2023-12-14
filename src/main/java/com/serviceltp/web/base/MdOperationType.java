
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
    "name",
    "spec",
    "desc",
    "in",
    "opt",
        "out",
    "xsd",
    "ext"
})
@Generated("jsonschema2pojo")
public class MdOperationType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("spec")
    private String spec;
    @JsonProperty("desc")
    private List<DsbInternationalStringType__1> desc = new ArrayList<DsbInternationalStringType__1>();
    @JsonProperty("in")
    private List<MdParameterType> in = new ArrayList<MdParameterType>();
    @JsonProperty("opt")
    private List<MdParameterType> opt = new ArrayList<MdParameterType>();
    @JsonProperty("out")
    private List<MdParameterType> out = new ArrayList<MdParameterType>();
    @JsonProperty("xsd")
    private String xsd;
    @JsonProperty("ext")
    private List<MdExtensionType> ext = new ArrayList<MdExtensionType>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("in")
    public List<MdParameterType> getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(List<MdParameterType> in) {
        this.in = in;
    }

    @JsonProperty("opt")
    public List<MdParameterType> getOpt() {
        return opt;
    }

    @JsonProperty("opt")
    public void setOpt(List<MdParameterType> opt) {
        this.opt = opt;
    }

    @JsonProperty("out")
    public List<MdParameterType> getOut() {
        return out;
    }

    @JsonProperty("out")
    public void setOut(List<MdParameterType> out) {
        this.out = out;
    }

    @JsonProperty("xsd")
    public String getXsd() {
        return xsd;
    }

    @JsonProperty("xsd")
    public void setXsd(String xsd) {
        this.xsd = xsd;
    }

    @JsonProperty("ext")
    public List<MdExtensionType> getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(List<MdExtensionType> ext) {
        this.ext = ext;
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
        sb.append(MdOperationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("in");
        sb.append('=');
        sb.append(((this.in == null)?"<null>":this.in));
        sb.append(',');
        sb.append("opt");
        sb.append('=');
        sb.append(((this.opt == null)?"<null>":this.opt));
        sb.append(',');
        sb.append("out");
        sb.append('=');
        sb.append(((this.out == null)?"<null>":this.out));
        sb.append(',');
        sb.append("xsd");
        sb.append('=');
        sb.append(((this.xsd == null)?"<null>":this.xsd));
        sb.append(',');
        sb.append("ext");
        sb.append('=');
        sb.append(((this.ext == null)?"<null>":this.ext));
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
        result = ((result* 31)+((this.opt == null)? 0 :this.opt.hashCode()));
        result = ((result* 31)+((this.in == null)? 0 :this.in.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.xsd == null)? 0 :this.xsd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.out == null)? 0 :this.out.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MdOperationType) == false) {
            return false;
        }
        MdOperationType rhs = ((MdOperationType) other);
        return ((((((((((this.ext == rhs.ext)||((this.ext!= null)&&this.ext.equals(rhs.ext)))&&((this.opt == rhs.opt)||((this.opt!= null)&&this.opt.equals(rhs.opt))))&&((this.in == rhs.in)||((this.in!= null)&&this.in.equals(rhs.in))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.xsd == rhs.xsd)||((this.xsd!= null)&&this.xsd.equals(rhs.xsd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.out == rhs.out)||((this.out!= null)&&this.out.equals(rhs.out))));
    }

}
