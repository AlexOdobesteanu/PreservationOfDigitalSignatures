package com.serviceltp.web.responseTypes;

import com.serviceltp.web.baseComponents.baseResponse.OptionalOutputs;
import com.serviceltp.web.baseComponents.baseResponse.Response;
import com.serviceltp.web.baseComponents.baseResponse.Result;

import java.util.List;

public class RetrieveInfoResponse extends Response {
    private List<Profile> Profile;

    public RetrieveInfoResponse(com.serviceltp.web.baseComponents.baseResponse.OptionalOutputs optionalOutputs, com.serviceltp.web.baseComponents.baseResponse.Result result, String requestID, List<com.serviceltp.web.responseTypes.Profile> profile) {
        super(optionalOutputs, result, requestID);
        Profile = profile;
    }
}
