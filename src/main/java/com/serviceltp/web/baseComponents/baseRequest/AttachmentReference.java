package com.serviceltp.web.baseComponents.baseRequest;
import java.net.URI;
import java.util.List;

public class AttachmentReference {
    private List<DigestInfo> DigestInfo;
    private URI AttRefUri;


    public AttachmentReference(List<com.serviceltp.web.baseComponents.baseRequest.DigestInfo> digestInfo, URI attRefUri) {
        DigestInfo = digestInfo;
        AttRefUri = attRefUri;
    }
}
