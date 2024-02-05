package com.serviceltp.web.baseComponents.baseResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransRefined {
    @JsonProperty("id")
    private String id;

    @JsonProperty("transaction_hash")
    private String hash;

    @JsonProperty("document_id")
    private String document_id;

    @JsonProperty("creation_date")
    private Date docDate;

    public TransRefined(String id, String hash, String document_id, Date docDate) {
        this.id = id;
        this.hash = hash;
        this.document_id = document_id;
        this.docDate = docDate;
    }
}
