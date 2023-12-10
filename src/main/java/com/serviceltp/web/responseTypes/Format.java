package com.serviceltp.web.responseTypes;
import com.serviceltp.web.baseComponents.baseRequest.Any;
import com.serviceltp.web.baseComponents.baseResponse.InternationalString;

import java.net.URI;
import java.util.List;

public class Format {
    private URI FormatID;
    private URI Specification;
    private List<InternationalString> Description;
    private List<Parameter> Parameter;
    private List<Any> Extension;
    private boolean IsDefault;

    public Format(URI formatID, URI specification, List<InternationalString> description, List<com.serviceltp.web.responseTypes.Parameter> parameter, List<Any> extension, boolean isDefault) {
        FormatID = formatID;
        Specification = specification;
        Description = description;
        Parameter = parameter;
        Extension = extension;
        IsDefault = isDefault;
    }

    public Format(URI formatID, URI specification, List<InternationalString> description, List<com.serviceltp.web.responseTypes.Parameter> parameter, List<Any> extension) {
        FormatID = formatID;
        Specification = specification;
        Description = description;
        Parameter = parameter;
        Extension = extension;
        IsDefault = false;
    }
}
