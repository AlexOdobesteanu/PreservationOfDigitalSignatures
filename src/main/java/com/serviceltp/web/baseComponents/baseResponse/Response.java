package com.serviceltp.web.baseComponents.baseResponse;


public class Response {
    private OptionalOutputs OptionalOutputs;
    private Result Result;
    private String RequestID;

    public Response(com.serviceltp.web.baseComponents.baseResponse.OptionalOutputs optionalOutputs, com.serviceltp.web.baseComponents.baseResponse.Result result, String requestID) {
        OptionalOutputs = optionalOutputs;
        Result = result;
        RequestID = requestID;
    }
}
