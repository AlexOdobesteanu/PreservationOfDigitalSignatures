package com.serviceltp.web.baseComponents.baseResponse;


import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
    private final List<String> valuesAllowed= new ArrayList<String>(Arrays.asList("urn:oasis:names:tc:dss:1.0:resultmajor:Success",
    "urn:oasis:names:tc:dss:1.0:resultmajor:RequesterError",
            "urn:oasis:names:tc:dss:1.0:resultmajor:ResponderError",
            "urn:oasis:names:tc:dss:1.0:resultmajor:InsufficientInformation",
            "urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:resultmajor:Pending"));
    private String ResultMajor;
    private URI ResultMinor;
    private InternationalString ResultMessage;
    private String ProblemReference;
    public Result(String resultMajor, URI resultMinor, InternationalString resultMessage, String problemReference) throws Exception {
        if(valuesAllowed.contains(resultMajor))
        {
            ResultMajor = resultMajor;
            ResultMinor = resultMinor;
            ResultMessage = resultMessage;
            ProblemReference = problemReference;
        }
        else
        {
            throw new Exception("Result Major value is not valid");
        }
    }
}
