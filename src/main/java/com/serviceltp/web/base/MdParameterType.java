
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
    "form",
    "xsd",
    "ext"
})
@Generated("jsonschema2pojo")
public class MdParameterType {

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
    @JsonProperty("form")
    private List<MdFormatType> form = new ArrayList<MdFormatType>();
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

    @JsonProperty("form")
    public List<MdFormatType> getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(List<MdFormatType> form) {
        this.form = form;
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
        sb.append(MdParameterType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
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
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.xsd == null)? 0 :this.xsd.hashCode()));
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
        if ((other instanceof MdParameterType) == false) {
            return false;
        }
        MdParameterType rhs = ((MdParameterType) other);
        return ((((((((this.ext == rhs.ext)||((this.ext!= null)&&this.ext.equals(rhs.ext)))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.xsd == rhs.xsd)||((this.xsd!= null)&&this.xsd.equals(rhs.xsd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
