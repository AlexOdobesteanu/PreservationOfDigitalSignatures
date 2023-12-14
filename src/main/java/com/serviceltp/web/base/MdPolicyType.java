
package com.serviceltp.web.base;

import java.net.URI;
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
    "type",
    "pbref",
    "pbdef",
    "ep",
    "ext"
})
@Generated("jsonschema2pojo")
public class MdPolicyType {

    @JsonProperty("type")
    private URI type;
    @JsonProperty("pbref")
    private MdPolicyByRefType pbref;
    @JsonProperty("pbdef")
    private DsbAnyType__1 pbdef;
    @JsonProperty("ep")
    private List<String> ep = new ArrayList<String>();
    @JsonProperty("ext")
    private List<MdExtensionType> ext = new ArrayList<MdExtensionType>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("type")
    public URI getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(URI type) {
        this.type = type;
    }

    @JsonProperty("pbref")
    public MdPolicyByRefType getPbref() {
        return pbref;
    }

    @JsonProperty("pbref")
    public void setPbref(MdPolicyByRefType pbref) {
        this.pbref = pbref;
    }

    @JsonProperty("pbdef")
    public DsbAnyType__1 getPbdef() {
        return pbdef;
    }

    @JsonProperty("pbdef")
    public void setPbdef(DsbAnyType__1 pbdef) {
        this.pbdef = pbdef;
    }

    @JsonProperty("ep")
    public List<String> getEp() {
        return ep;
    }

    @JsonProperty("ep")
    public void setEp(List<String> ep) {
        this.ep = ep;
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
        sb.append(MdPolicyType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("pbref");
        sb.append('=');
        sb.append(((this.pbref == null)?"<null>":this.pbref));
        sb.append(',');
        sb.append("pbdef");
        sb.append('=');
        sb.append(((this.pbdef == null)?"<null>":this.pbdef));
        sb.append(',');
        sb.append("ep");
        sb.append('=');
        sb.append(((this.ep == null)?"<null>":this.ep));
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
        result = ((result* 31)+((this.pbref == null)? 0 :this.pbref.hashCode()));
        result = ((result* 31)+((this.pbdef == null)? 0 :this.pbdef.hashCode()));
        result = ((result* 31)+((this.ep == null)? 0 :this.ep.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MdPolicyType) == false) {
            return false;
        }
        MdPolicyType rhs = ((MdPolicyType) other);
        return (((((((this.ext == rhs.ext)||((this.ext!= null)&&this.ext.equals(rhs.ext)))&&((this.pbref == rhs.pbref)||((this.pbref!= null)&&this.pbref.equals(rhs.pbref))))&&((this.pbdef == rhs.pbdef)||((this.pbdef!= null)&&this.pbdef.equals(rhs.pbdef))))&&((this.ep == rhs.ep)||((this.ep!= null)&&this.ep.equals(rhs.ep))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
