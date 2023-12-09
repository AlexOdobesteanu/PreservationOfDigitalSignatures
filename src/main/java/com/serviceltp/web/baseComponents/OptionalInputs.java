package com.serviceltp.web.baseComponents;

import java.net.URI;
import java.util.List;

public class OptionalInputs {
    private List<URI> servicePolicies;
    private String language;
//    private List<SubComponent> otherComponents;


    // Constructor
    public OptionalInputs(List<URI> servicePolicies, String language/*, maybe add SubComponent here*/) {
        this.servicePolicies = servicePolicies;
        this.language = language;
//        this.otherComponents = otherComponents;
    }

    // Getter and Setter methods for ServicePolicies
    public List<URI> getServicePolicies() {
        return servicePolicies;
    }

    public void setServicePolicies(List<URI> servicePolicies) {
        this.servicePolicies = servicePolicies;
    }

    // Getter and Setter methods for Language
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
