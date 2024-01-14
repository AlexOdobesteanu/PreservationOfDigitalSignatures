package com.serviceltp.web.services;

import com.serviceltp.web.models.Document;

public interface DocumentService {
    Document saveDocument(Document document);
    void updateDocument(Document document, Long documentId);
    Document getById(long id);
}
