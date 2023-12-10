package com.serviceltp.web.baseComponents.baseRequest;

import java.net.URI;
import java.util.List;

public class OptionalInputs {
    private List<URI> ServicePolicy;
    private String Language;
    private List<Any> Other;

    public OptionalInputs(List<URI> servicePolicy, String language, List<Any> other) {
        ServicePolicy = servicePolicy;
        Language = language;
        Other = other;
    }
}
