package com.serviceltp.web.responseTypes;

import com.serviceltp.web.baseComponents.baseRequest.Any;

import java.net.URI;
import java.util.List;

public class Policy {
    private PolicyByRef PolicyByRef;
    private Any PolicyByDef;
    private List<URI> EarlierPolicy;
    private List<Extension> Extension;
    private URI Type;

    public Policy(com.serviceltp.web.responseTypes.PolicyByRef policyByRef, Any policyByDef, List<URI> earlierPolicy, List<com.serviceltp.web.responseTypes.Extension> extension, URI type) {
        PolicyByRef = policyByRef;
        PolicyByDef = policyByDef;
        EarlierPolicy = earlierPolicy;
        Extension = extension;
        Type = type;
    }
}
