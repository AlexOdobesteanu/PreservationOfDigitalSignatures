package com.serviceltp.web.responseTypes;

import com.serviceltp.web.baseComponents.baseResponse.InternationalString;

import java.net.URI;
import java.util.List;

public class Parameter {
    private String Name;
    private URI Specification;
    private List<InternationalString> Description;
    private List<Format> Format;
    private URI Schema;
    private List<Extension> Extension;

    public Parameter(String name, URI specification, List<InternationalString> description, List<com.serviceltp.web.responseTypes.Format> format, URI schema, List<com.serviceltp.web.responseTypes.Extension> extension) {
        Name = name;
        Specification = specification;
        Description = description;
        Format = format;
        Schema = schema;
        Extension = extension;
    }
}
