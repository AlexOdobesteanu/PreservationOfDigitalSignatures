package com.serviceltp.web.services;

import com.serviceltp.web.models.Document;

public interface DocumentService {
    void saveDocument(Document document);
    void updateDocument(Document document, Long documentId);
}
