
package com.serviceltp.web.base;

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
    "ID",
    "val",
    "attRef",
    "transforms",
    "mimeType",
    "idRef"
})
@Generated("jsonschema2pojo")
public class DsbAnyType {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("val")
    private String val;
    @JsonProperty("attRef")
    private DsbAttachmentReferenceType attRef;
    @JsonProperty("transforms")
    private DsigrwTransformsType transforms;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("idRef")
    private String idRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("val")
    public String getVal() {
        return val;
    }

    @JsonProperty("val")
    public void setVal(String val) {
        this.val = val;
    }

    @JsonProperty("attRef")
    public DsbAttachmentReferenceType getAttRef() {
        return attRef;
    }

    @JsonProperty("attRef")
    public void setAttRef(DsbAttachmentReferenceType attRef) {
        this.attRef = attRef;
    }

    @JsonProperty("transforms")
    public DsigrwTransformsType getTransforms() {
        return transforms;
    }

    @JsonProperty("transforms")
    public void setTransforms(DsigrwTransformsType transforms) {
        this.transforms = transforms;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("idRef")
    public String getIdRef() {
        return idRef;
    }

    @JsonProperty("idRef")
    public void setIdRef(String idRef) {
        this.idRef = idRef;
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
        sb.append(DsbAnyType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("val");
        sb.append('=');
        sb.append(((this.val == null)?"<null>":this.val));
        sb.append(',');
        sb.append("attRef");
        sb.append('=');
        sb.append(((this.attRef == null)?"<null>":this.attRef));
        sb.append(',');
        sb.append("transforms");
        sb.append('=');
        sb.append(((this.transforms == null)?"<null>":this.transforms));
        sb.append(',');
        sb.append("mimeType");
        sb.append('=');
        sb.append(((this.mimeType == null)?"<null>":this.mimeType));
        sb.append(',');
        sb.append("idRef");
        sb.append('=');
        sb.append(((this.idRef == null)?"<null>":this.idRef));
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
        result = ((result* 31)+((this.transforms == null)? 0 :this.transforms.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.mimeType == null)? 0 :this.mimeType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attRef == null)? 0 :this.attRef.hashCode()));
        result = ((result* 31)+((this.idRef == null)? 0 :this.idRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DsbAnyType) == false) {
            return false;
        }
        DsbAnyType rhs = ((DsbAnyType) other);
        return ((((((((this.val == rhs.val)||((this.val!= null)&&this.val.equals(rhs.val)))&&((this.transforms == rhs.transforms)||((this.transforms!= null)&&this.transforms.equals(rhs.transforms))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.mimeType == rhs.mimeType)||((this.mimeType!= null)&&this.mimeType.equals(rhs.mimeType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attRef == rhs.attRef)||((this.attRef!= null)&&this.attRef.equals(rhs.attRef))))&&((this.idRef == rhs.idRef)||((this.idRef!= null)&&this.idRef.equals(rhs.idRef))));
    }

}
