package com.serviceltp.web.requestTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Status {
    private final List<String> valuesAllowed= new ArrayList<String>(
            Arrays.asList("active","inactive","all")
    );

    private String value;

    public Status(String value) throws Exception {
        if(valuesAllowed.contains(value))
            this.value=value;
        else
            throw new Exception("Status value is not valid");
    }
}
