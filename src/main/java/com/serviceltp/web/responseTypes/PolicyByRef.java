package com.serviceltp.web.responseTypes;

import java.net.URI;

public class PolicyByRef {
    private URI PolicyID;
    private URI PolicyLocation;

    public PolicyByRef(URI policyID, URI policyLocation) {
        PolicyID = policyID;
        PolicyLocation = policyLocation;
    }
}
