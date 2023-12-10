package com.serviceltp.web.responseTypes;

import com.serviceltp.web.baseComponents.baseResponse.InternationalString;

import java.net.URI;
import java.util.List;

public class Operation {
    private String Name;
    private URI Specification;
    private List<InternationalString> Description;
    private List<Parameter> Input;
    private List<Parameter> Option;
    private List<Parameter> Output;
    private URI Schema;
    private List<Extension> Extension;

    public Operation(String name, URI specification, List<InternationalString> description, List<Parameter> input, List<Parameter> option, List<Parameter> output, URI schema, List<com.serviceltp.web.responseTypes.Extension> extension) {
        Name = name;
        Specification = specification;
        Description = description;
        Input = input;
        Option = option;
        Output = output;
        Schema = schema;
        Extension = extension;
    }
}
