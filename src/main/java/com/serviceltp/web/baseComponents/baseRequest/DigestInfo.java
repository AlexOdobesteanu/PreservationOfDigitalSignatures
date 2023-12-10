package com.serviceltp.web.baseComponents.baseRequest;

public class DigestInfo {
    private String DigestMethod;
    private String DigestValue;

    public DigestInfo(String digestMethod, String digestValue) {
        DigestMethod = digestMethod;
        DigestValue = digestValue;
    }
}
