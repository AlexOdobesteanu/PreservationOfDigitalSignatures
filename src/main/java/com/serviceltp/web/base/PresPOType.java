
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
    "binaryData",
    "xmlData",
    "formatId",
    "mimeType",
    "pronomId",
    "id",
    "relObj"
})
@Generated("jsonschema2pojo")
public class PresPOType {

    @JsonProperty("binaryData")
    private PresPOTypeBinaryData binaryData;
    @JsonProperty("xmlData")
    private PresPOTypeXmlData xmlData;
    @JsonProperty("formatId")
    private String formatId;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("pronomId")
    private String pronomId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("relObj")
    private List<String> relObj = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("binaryData")
    public PresPOTypeBinaryData getBinaryData() {
        return binaryData;
    }

    @JsonProperty("binaryData")
    public void setBinaryData(PresPOTypeBinaryData binaryData) {
        this.binaryData = binaryData;
    }

    @JsonProperty("xmlData")
    public PresPOTypeXmlData getXmlData() {
        return xmlData;
    }

    @JsonProperty("xmlData")
    public void setXmlData(PresPOTypeXmlData xmlData) {
        this.xmlData = xmlData;
    }

    @JsonProperty("formatId")
    public String getFormatId() {
        return formatId;
    }

    @JsonProperty("formatId")
    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("pronomId")
    public String getPronomId() {
        return pronomId;
    }

    @JsonProperty("pronomId")
    public void setPronomId(String pronomId) {
        this.pronomId = pronomId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("relObj")
    public List<String> getRelObj() {
        return relObj;
    }

    @JsonProperty("relObj")
    public void setRelObj(List<String> relObj) {
        this.relObj = relObj;
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
        sb.append(PresPOType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("binaryData");
        sb.append('=');
        sb.append(((this.binaryData == null)?"<null>":this.binaryData));
        sb.append(',');
        sb.append("xmlData");
        sb.append('=');
        sb.append(((this.xmlData == null)?"<null>":this.xmlData));
        sb.append(',');
        sb.append("formatId");
        sb.append('=');
        sb.append(((this.formatId == null)?"<null>":this.formatId));
        sb.append(',');
        sb.append("mimeType");
        sb.append('=');
        sb.append(((this.mimeType == null)?"<null>":this.mimeType));
        sb.append(',');
        sb.append("pronomId");
        sb.append('=');
        sb.append(((this.pronomId == null)?"<null>":this.pronomId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("relObj");
        sb.append('=');
        sb.append(((this.relObj == null)?"<null>":this.relObj));
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
        result = ((result* 31)+((this.formatId == null)? 0 :this.formatId.hashCode()));
        result = ((result* 31)+((this.relObj == null)? 0 :this.relObj.hashCode()));
        result = ((result* 31)+((this.binaryData == null)? 0 :this.binaryData.hashCode()));
        result = ((result* 31)+((this.mimeType == null)? 0 :this.mimeType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pronomId == null)? 0 :this.pronomId.hashCode()));
        result = ((result* 31)+((this.xmlData == null)? 0 :this.xmlData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresPOType) == false) {
            return false;
        }
        PresPOType rhs = ((PresPOType) other);
        return (((((((((this.formatId == rhs.formatId)||((this.formatId!= null)&&this.formatId.equals(rhs.formatId)))&&((this.relObj == rhs.relObj)||((this.relObj!= null)&&this.relObj.equals(rhs.relObj))))&&((this.binaryData == rhs.binaryData)||((this.binaryData!= null)&&this.binaryData.equals(rhs.binaryData))))&&((this.mimeType == rhs.mimeType)||((this.mimeType!= null)&&this.mimeType.equals(rhs.mimeType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pronomId == rhs.pronomId)||((this.pronomId!= null)&&this.pronomId.equals(rhs.pronomId))))&&((this.xmlData == rhs.xmlData)||((this.xmlData!= null)&&this.xmlData.equals(rhs.xmlData))));
    }

}
