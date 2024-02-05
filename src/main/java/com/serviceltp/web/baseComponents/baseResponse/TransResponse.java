package com.serviceltp.web.baseComponents.baseResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.serviceltp.web.models.Trans;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransResponse {
    List<TransRefined> transList;

    public TransResponse(List<TransRefined> transList) {
        this.transList = transList;
    }

    public List<TransRefined> getList() {
        return transList;
    }
    public void setSummaryList(List<TransRefined> summaryList) {
        this.transList = summaryList;
    }
}
