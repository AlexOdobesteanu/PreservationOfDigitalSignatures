
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
    "presPO",
    "preserveResp",
    "updPoc",
    "updPocResp",
    "getPO",
    "getPOResp",
    "delPO",
    "getResp",
    "getTrace",
    "getTraceResp",
    "valEvidence",
    "valEvidenceResp",
    "sor",
    "profile",
    "stat",
    "retrvInfo",
    "retrvInfoResp",
    "presStoreModel",
    "search",
    "searchResp",
    "digestList",
    "req",
    "resp"
})
@Generated("jsonschema2pojo")
public class PreservationApiSchema {

    @JsonProperty("presPO")
    private PresPreservePOType presPO;
    @JsonProperty("preserveResp")
    private PresPreservePOResponseType preserveResp;
    @JsonProperty("updPoc")
    private PresUpdatePOCType updPoc;
    @JsonProperty("updPocResp")
    private PresUpdatePOCResponseType updPocResp;
    @JsonProperty("getPO")
    private PresRetrievePOType getPO;
    @JsonProperty("getPOResp")
    private PresRetrievePOResponseType getPOResp;
    @JsonProperty("delPO")
    private PresDeletePOType delPO;
    @JsonProperty("getResp")
    private PresResponseType getResp;
    @JsonProperty("getTrace")
    private PresRetrieveTraceType getTrace;
    @JsonProperty("getTraceResp")
    private PresRetrieveTraceResponseType getTraceResp;
    @JsonProperty("valEvidence")
    private PresValidateEvidenceType valEvidence;
    @JsonProperty("valEvidenceResp")
    private PresValidateEvidenceResponseType valEvidenceResp;
    @JsonProperty("sor")
    private String sor;
    @JsonProperty("profile")
    private PresProfileType profile;
    @JsonProperty("stat")
    private String stat;
    @JsonProperty("retrvInfo")
    private PresRetrieveInfoType retrvInfo;
    @JsonProperty("retrvInfoResp")
    private PresRetrieveInfoResponseType retrvInfoResp;
    @JsonProperty("presStoreModel")
    private String presStoreModel;
    @JsonProperty("search")
    private PresSearchType search;
    @JsonProperty("searchResp")
    private PresSearchResponseType searchResp;
    @JsonProperty("digestList")
    private PresDigestListType digestList;
    @JsonProperty("req")
    private PresRequestType req;
    @JsonProperty("resp")
    private PresResponseType resp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("presPO")
    public PresPreservePOType getPresPO() {
        return presPO;
    }

    @JsonProperty("presPO")
    public void setPresPO(PresPreservePOType presPO) {
        this.presPO = presPO;
    }

    @JsonProperty("preserveResp")
    public PresPreservePOResponseType getPreserveResp() {
        return preserveResp;
    }

    @JsonProperty("preserveResp")
    public void setPreserveResp(PresPreservePOResponseType preserveResp) {
        this.preserveResp = preserveResp;
    }

    @JsonProperty("updPoc")
    public PresUpdatePOCType getUpdPoc() {
        return updPoc;
    }

    @JsonProperty("updPoc")
    public void setUpdPoc(PresUpdatePOCType updPoc) {
        this.updPoc = updPoc;
    }

    @JsonProperty("updPocResp")
    public PresUpdatePOCResponseType getUpdPocResp() {
        return updPocResp;
    }

    @JsonProperty("updPocResp")
    public void setUpdPocResp(PresUpdatePOCResponseType updPocResp) {
        this.updPocResp = updPocResp;
    }

    @JsonProperty("getPO")
    public PresRetrievePOType getGetPO() {
        return getPO;
    }

    @JsonProperty("getPO")
    public void setGetPO(PresRetrievePOType getPO) {
        this.getPO = getPO;
    }

    @JsonProperty("getPOResp")
    public PresRetrievePOResponseType getGetPOResp() {
        return getPOResp;
    }

    @JsonProperty("getPOResp")
    public void setGetPOResp(PresRetrievePOResponseType getPOResp) {
        this.getPOResp = getPOResp;
    }

    @JsonProperty("delPO")
    public PresDeletePOType getDelPO() {
        return delPO;
    }

    @JsonProperty("delPO")
    public void setDelPO(PresDeletePOType delPO) {
        this.delPO = delPO;
    }

    @JsonProperty("getResp")
    public PresResponseType getGetResp() {
        return getResp;
    }

    @JsonProperty("getResp")
    public void setGetResp(PresResponseType getResp) {
        this.getResp = getResp;
    }

    @JsonProperty("getTrace")
    public PresRetrieveTraceType getGetTrace() {
        return getTrace;
    }

    @JsonProperty("getTrace")
    public void setGetTrace(PresRetrieveTraceType getTrace) {
        this.getTrace = getTrace;
    }

    @JsonProperty("getTraceResp")
    public PresRetrieveTraceResponseType getGetTraceResp() {
        return getTraceResp;
    }

    @JsonProperty("getTraceResp")
    public void setGetTraceResp(PresRetrieveTraceResponseType getTraceResp) {
        this.getTraceResp = getTraceResp;
    }

    @JsonProperty("valEvidence")
    public PresValidateEvidenceType getValEvidence() {
        return valEvidence;
    }

    @JsonProperty("valEvidence")
    public void setValEvidence(PresValidateEvidenceType valEvidence) {
        this.valEvidence = valEvidence;
    }

    @JsonProperty("valEvidenceResp")
    public PresValidateEvidenceResponseType getValEvidenceResp() {
        return valEvidenceResp;
    }

    @JsonProperty("valEvidenceResp")
    public void setValEvidenceResp(PresValidateEvidenceResponseType valEvidenceResp) {
        this.valEvidenceResp = valEvidenceResp;
    }

    @JsonProperty("sor")
    public String getSor() {
        return sor;
    }

    @JsonProperty("sor")
    public void setSor(String sor) {
        this.sor = sor;
    }

    @JsonProperty("profile")
    public PresProfileType getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(PresProfileType profile) {
        this.profile = profile;
    }

    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

    @JsonProperty("retrvInfo")
    public PresRetrieveInfoType getRetrvInfo() {
        return retrvInfo;
    }

    @JsonProperty("retrvInfo")
    public void setRetrvInfo(PresRetrieveInfoType retrvInfo) {
        this.retrvInfo = retrvInfo;
    }

    @JsonProperty("retrvInfoResp")
    public PresRetrieveInfoResponseType getRetrvInfoResp() {
        return retrvInfoResp;
    }

    @JsonProperty("retrvInfoResp")
    public void setRetrvInfoResp(PresRetrieveInfoResponseType retrvInfoResp) {
        this.retrvInfoResp = retrvInfoResp;
    }

    @JsonProperty("presStoreModel")
    public String getPresStoreModel() {
        return presStoreModel;
    }

    @JsonProperty("presStoreModel")
    public void setPresStoreModel(String presStoreModel) {
        this.presStoreModel = presStoreModel;
    }

    @JsonProperty("search")
    public PresSearchType getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(PresSearchType search) {
        this.search = search;
    }

    @JsonProperty("searchResp")
    public PresSearchResponseType getSearchResp() {
        return searchResp;
    }

    @JsonProperty("searchResp")
    public void setSearchResp(PresSearchResponseType searchResp) {
        this.searchResp = searchResp;
    }

    @JsonProperty("digestList")
    public PresDigestListType getDigestList() {
        return digestList;
    }

    @JsonProperty("digestList")
    public void setDigestList(PresDigestListType digestList) {
        this.digestList = digestList;
    }

    @JsonProperty("req")
    public PresRequestType getReq() {
        return req;
    }

    @JsonProperty("req")
    public void setReq(PresRequestType req) {
        this.req = req;
    }

    @JsonProperty("resp")
    public PresResponseType getResp() {
        return resp;
    }

    @JsonProperty("resp")
    public void setResp(PresResponseType resp) {
        this.resp = resp;
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
        sb.append(PreservationApiSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("presPO");
        sb.append('=');
        sb.append(((this.presPO == null)?"<null>":this.presPO));
        sb.append(',');
        sb.append("preserveResp");
        sb.append('=');
        sb.append(((this.preserveResp == null)?"<null>":this.preserveResp));
        sb.append(',');
        sb.append("updPoc");
        sb.append('=');
        sb.append(((this.updPoc == null)?"<null>":this.updPoc));
        sb.append(',');
        sb.append("updPocResp");
        sb.append('=');
        sb.append(((this.updPocResp == null)?"<null>":this.updPocResp));
        sb.append(',');
        sb.append("getPO");
        sb.append('=');
        sb.append(((this.getPO == null)?"<null>":this.getPO));
        sb.append(',');
        sb.append("getPOResp");
        sb.append('=');
        sb.append(((this.getPOResp == null)?"<null>":this.getPOResp));
        sb.append(',');
        sb.append("delPO");
        sb.append('=');
        sb.append(((this.delPO == null)?"<null>":this.delPO));
        sb.append(',');
        sb.append("getResp");
        sb.append('=');
        sb.append(((this.getResp == null)?"<null>":this.getResp));
        sb.append(',');
        sb.append("getTrace");
        sb.append('=');
        sb.append(((this.getTrace == null)?"<null>":this.getTrace));
        sb.append(',');
        sb.append("getTraceResp");
        sb.append('=');
        sb.append(((this.getTraceResp == null)?"<null>":this.getTraceResp));
        sb.append(',');
        sb.append("valEvidence");
        sb.append('=');
        sb.append(((this.valEvidence == null)?"<null>":this.valEvidence));
        sb.append(',');
        sb.append("valEvidenceResp");
        sb.append('=');
        sb.append(((this.valEvidenceResp == null)?"<null>":this.valEvidenceResp));
        sb.append(',');
        sb.append("sor");
        sb.append('=');
        sb.append(((this.sor == null)?"<null>":this.sor));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("stat");
        sb.append('=');
        sb.append(((this.stat == null)?"<null>":this.stat));
        sb.append(',');
        sb.append("retrvInfo");
        sb.append('=');
        sb.append(((this.retrvInfo == null)?"<null>":this.retrvInfo));
        sb.append(',');
        sb.append("retrvInfoResp");
        sb.append('=');
        sb.append(((this.retrvInfoResp == null)?"<null>":this.retrvInfoResp));
        sb.append(',');
        sb.append("presStoreModel");
        sb.append('=');
        sb.append(((this.presStoreModel == null)?"<null>":this.presStoreModel));
        sb.append(',');
        sb.append("search");
        sb.append('=');
        sb.append(((this.search == null)?"<null>":this.search));
        sb.append(',');
        sb.append("searchResp");
        sb.append('=');
        sb.append(((this.searchResp == null)?"<null>":this.searchResp));
        sb.append(',');
        sb.append("digestList");
        sb.append('=');
        sb.append(((this.digestList == null)?"<null>":this.digestList));
        sb.append(',');
        sb.append("req");
        sb.append('=');
        sb.append(((this.req == null)?"<null>":this.req));
        sb.append(',');
        sb.append("resp");
        sb.append('=');
        sb.append(((this.resp == null)?"<null>":this.resp));
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
        result = ((result* 31)+((this.presStoreModel == null)? 0 :this.presStoreModel.hashCode()));
        result = ((result* 31)+((this.getResp == null)? 0 :this.getResp.hashCode()));
        result = ((result* 31)+((this.stat == null)? 0 :this.stat.hashCode()));
        result = ((result* 31)+((this.updPoc == null)? 0 :this.updPoc.hashCode()));
        result = ((result* 31)+((this.resp == null)? 0 :this.resp.hashCode()));
        result = ((result* 31)+((this.updPocResp == null)? 0 :this.updPocResp.hashCode()));
        result = ((result* 31)+((this.getTraceResp == null)? 0 :this.getTraceResp.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.retrvInfoResp == null)? 0 :this.retrvInfoResp.hashCode()));
        result = ((result* 31)+((this.preserveResp == null)? 0 :this.preserveResp.hashCode()));
        result = ((result* 31)+((this.valEvidenceResp == null)? 0 :this.valEvidenceResp.hashCode()));
        result = ((result* 31)+((this.getPO == null)? 0 :this.getPO.hashCode()));
        result = ((result* 31)+((this.getPOResp == null)? 0 :this.getPOResp.hashCode()));
        result = ((result* 31)+((this.search == null)? 0 :this.search.hashCode()));
        result = ((result* 31)+((this.valEvidence == null)? 0 :this.valEvidence.hashCode()));
        result = ((result* 31)+((this.digestList == null)? 0 :this.digestList.hashCode()));
        result = ((result* 31)+((this.sor == null)? 0 :this.sor.hashCode()));
        result = ((result* 31)+((this.delPO == null)? 0 :this.delPO.hashCode()));
        result = ((result* 31)+((this.getTrace == null)? 0 :this.getTrace.hashCode()));
        result = ((result* 31)+((this.presPO == null)? 0 :this.presPO.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.retrvInfo == null)? 0 :this.retrvInfo.hashCode()));
        result = ((result* 31)+((this.searchResp == null)? 0 :this.searchResp.hashCode()));
        result = ((result* 31)+((this.req == null)? 0 :this.req.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreservationApiSchema) == false) {
            return false;
        }
        PreservationApiSchema rhs = ((PreservationApiSchema) other);
        return (((((((((((((((((((((((((this.presStoreModel == rhs.presStoreModel)||((this.presStoreModel!= null)&&this.presStoreModel.equals(rhs.presStoreModel)))&&((this.getResp == rhs.getResp)||((this.getResp!= null)&&this.getResp.equals(rhs.getResp))))&&((this.stat == rhs.stat)||((this.stat!= null)&&this.stat.equals(rhs.stat))))&&((this.updPoc == rhs.updPoc)||((this.updPoc!= null)&&this.updPoc.equals(rhs.updPoc))))&&((this.resp == rhs.resp)||((this.resp!= null)&&this.resp.equals(rhs.resp))))&&((this.updPocResp == rhs.updPocResp)||((this.updPocResp!= null)&&this.updPocResp.equals(rhs.updPocResp))))&&((this.getTraceResp == rhs.getTraceResp)||((this.getTraceResp!= null)&&this.getTraceResp.equals(rhs.getTraceResp))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.retrvInfoResp == rhs.retrvInfoResp)||((this.retrvInfoResp!= null)&&this.retrvInfoResp.equals(rhs.retrvInfoResp))))&&((this.preserveResp == rhs.preserveResp)||((this.preserveResp!= null)&&this.preserveResp.equals(rhs.preserveResp))))&&((this.valEvidenceResp == rhs.valEvidenceResp)||((this.valEvidenceResp!= null)&&this.valEvidenceResp.equals(rhs.valEvidenceResp))))&&((this.getPO == rhs.getPO)||((this.getPO!= null)&&this.getPO.equals(rhs.getPO))))&&((this.getPOResp == rhs.getPOResp)||((this.getPOResp!= null)&&this.getPOResp.equals(rhs.getPOResp))))&&((this.search == rhs.search)||((this.search!= null)&&this.search.equals(rhs.search))))&&((this.valEvidence == rhs.valEvidence)||((this.valEvidence!= null)&&this.valEvidence.equals(rhs.valEvidence))))&&((this.digestList == rhs.digestList)||((this.digestList!= null)&&this.digestList.equals(rhs.digestList))))&&((this.sor == rhs.sor)||((this.sor!= null)&&this.sor.equals(rhs.sor))))&&((this.delPO == rhs.delPO)||((this.delPO!= null)&&this.delPO.equals(rhs.delPO))))&&((this.getTrace == rhs.getTrace)||((this.getTrace!= null)&&this.getTrace.equals(rhs.getTrace))))&&((this.presPO == rhs.presPO)||((this.presPO!= null)&&this.presPO.equals(rhs.presPO))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.retrvInfo == rhs.retrvInfo)||((this.retrvInfo!= null)&&this.retrvInfo.equals(rhs.retrvInfo))))&&((this.searchResp == rhs.searchResp)||((this.searchResp!= null)&&this.searchResp.equals(rhs.searchResp))))&&((this.req == rhs.req)||((this.req!= null)&&this.req.equals(rhs.req))));
    }

}
