package com.serviceltp.web.baseComponents.baseRequest;

public class Request {
    private OptionalInputs OptionalInputs;
    private String RequestID;

    public Request(OptionalInputs opt, String id)
    {
        this.OptionalInputs=opt;
        this.RequestID=id;
    }

}
