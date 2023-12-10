package com.serviceltp.web.baseComponents.baseRequest;

public class Any {

    private String Id;
    private String Value;

    private AttachmentReference AttRef;

    private String MimeType;

    private String IdRef;


    public Any(String id, String value, AttachmentReference attRef, String mimeType, String idRef) {
        Id = id;
        Value = value;
        AttRef = attRef;
        MimeType = mimeType;
        IdRef = idRef;
    }
}
