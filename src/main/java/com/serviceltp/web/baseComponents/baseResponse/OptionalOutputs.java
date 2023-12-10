package com.serviceltp.web.baseComponents.baseResponse;

import com.serviceltp.web.baseComponents.baseRequest.Any;

import java.net.URI;
import java.util.List;

public class OptionalOutputs {
    private List<URI> AppliedPolicy;
    private List<Any> Other;

    public OptionalOutputs(List<URI> appliedPolicy, List<Any> other) {
        AppliedPolicy = appliedPolicy;
        Other = other;
    }
}
