
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
    "xpath",
    "val",
    "b64Content",
    "xPath",
    "nsDecl",
    "alg"
})
@Generated("jsonschema2pojo")
public class DsigrwTransformType__1 {

    @JsonProperty("xpath")
    private List<String> xpath = new ArrayList<String>();
    @JsonProperty("val")
    private String val;
    @JsonProperty("b64Content")
    private String b64Content;
    @JsonProperty("xPath")
    private List<String> xPath = new ArrayList<String>();
    @JsonProperty("nsDecl")
    private List<NslNsPrefixMappingType__1> nsDecl = new ArrayList<NslNsPrefixMappingType__1>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    private String alg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("xpath")
    public List<String> getXpath() {
        return xpath;
    }

    @JsonProperty("xpath")
    public void setXpath(List<String> xpath) {
        this.xpath = xpath;
    }

    @JsonProperty("val")
    public String getVal() {
        return val;
    }

    @JsonProperty("val")
    public void setVal(String val) {
        this.val = val;
    }

    @JsonProperty("b64Content")
    public String getB64Content() {
        return b64Content;
    }

    @JsonProperty("b64Content")
    public void setB64Content(String b64Content) {
        this.b64Content = b64Content;
    }

    @JsonProperty("xPath")
    public List<String> getxPath() {
        return xPath;
    }

    @JsonProperty("xPath")
    public void setxPath(List<String> xPath) {
        this.xPath = xPath;
    }

    @JsonProperty("nsDecl")
    public List<NslNsPrefixMappingType__1> getNsDecl() {
        return nsDecl;
    }

    @JsonProperty("nsDecl")
    public void setNsDecl(List<NslNsPrefixMappingType__1> nsDecl) {
        this.nsDecl = nsDecl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public String getAlg() {
        return alg;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public void setAlg(String alg) {
        this.alg = alg;
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
        sb.append(DsigrwTransformType__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xpath");
        sb.append('=');
        sb.append(((this.xpath == null)?"<null>":this.xpath));
        sb.append(',');
        sb.append("val");
        sb.append('=');
        sb.append(((this.val == null)?"<null>":this.val));
        sb.append(',');
        sb.append("b64Content");
        sb.append('=');
        sb.append(((this.b64Content == null)?"<null>":this.b64Content));
        sb.append(',');
        sb.append("xPath");
        sb.append('=');
        sb.append(((this.xPath == null)?"<null>":this.xPath));
        sb.append(',');
        sb.append("nsDecl");
        sb.append('=');
        sb.append(((this.nsDecl == null)?"<null>":this.nsDecl));
        sb.append(',');
        sb.append("alg");
        sb.append('=');
        sb.append(((this.alg == null)?"<null>":this.alg));
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
        result = ((result* 31)+((this.val == null)? 0 :this.val.hashCode()));
        result = ((result* 31)+((this.b64Content == null)? 0 :this.b64Content.hashCode()));
        result = ((result* 31)+((this.xpath == null)? 0 :this.xpath.hashCode()));
        result = ((result* 31)+((this.nsDecl == null)? 0 :this.nsDecl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.xPath == null)? 0 :this.xPath.hashCode()));
        result = ((result* 31)+((this.alg == null)? 0 :this.alg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsigrwTransformType__1) == false) {
            return false;
        }
        DsigrwTransformType__1 rhs = ((DsigrwTransformType__1) other);
        return ((((((((this.val == rhs.val)||((this.val!= null)&&this.val.equals(rhs.val)))&&((this.b64Content == rhs.b64Content)||((this.b64Content!= null)&&this.b64Content.equals(rhs.b64Content))))&&((this.xpath == rhs.xpath)||((this.xpath!= null)&&this.xpath.equals(rhs.xpath))))&&((this.nsDecl == rhs.nsDecl)||((this.nsDecl!= null)&&this.nsDecl.equals(rhs.nsDecl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.xPath == rhs.xPath)||((this.xPath!= null)&&this.xPath.equals(rhs.xPath))))&&((this.alg == rhs.alg)||((this.alg!= null)&&this.alg.equals(rhs.alg))));
    }

}
