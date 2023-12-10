package com.serviceltp.web.responseTypes;

import com.serviceltp.web.baseComponents.baseResponse.InternationalString;

import java.net.URI;
import java.util.List;

public class Profile {
    private URI ProfileIdentifier;
    private List<Operation> Operation;
    private List<Policy> Policy;
    private ProfileValidityPeriod ProfileValidityPeriod;
    private PreservationStorageModel PreservationStorageModel;
    private List<URI> PreservationGoal;
    private List<Format> EvidenceFormat;
    private List<URI> Specification;
    private List<InternationalString> Description;
    private URI SchemeIdentifier;
    private String ExpectedEvidenceDuration;
    private String PreservationEvidenceRetentionPeriod;
    private List<Extension> Extension;


    public Profile(URI profileIdentifier, List<com.serviceltp.web.responseTypes.Operation> operation, List<com.serviceltp.web.responseTypes.Policy> policy, com.serviceltp.web.responseTypes.ProfileValidityPeriod profileValidityPeriod, com.serviceltp.web.responseTypes.PreservationStorageModel preservationStorageModel, List<URI> preservationGoal, List<Format> evidenceFormat, List<URI> specification, List<InternationalString> description, URI schemeIdentifier, String expectedEvidenceDuration, String preservationEvidenceRetentionPeriod, List<com.serviceltp.web.responseTypes.Extension> extension) {
        ProfileIdentifier = profileIdentifier;
        Operation = operation;
        Policy = policy;
        ProfileValidityPeriod = profileValidityPeriod;
        PreservationStorageModel = preservationStorageModel;
        PreservationGoal = preservationGoal;
        EvidenceFormat = evidenceFormat;
        Specification = specification;
        Description = description;
        SchemeIdentifier = schemeIdentifier;
        ExpectedEvidenceDuration = expectedEvidenceDuration;
        PreservationEvidenceRetentionPeriod = preservationEvidenceRetentionPeriod;
        Extension = extension;
    }
}
