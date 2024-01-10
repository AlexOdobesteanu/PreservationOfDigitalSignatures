package com.serviceltp.web.services;

import com.serviceltp.web.models.Document;
import com.serviceltp.web.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public void saveDocument(Document document) {
        documentRepository.save(document);
    }
    @Override
    public void updateDocument(Document document, Long documentId) {
        Document docDb = documentRepository.findById(documentId).orElseThrow();
        docDb.setName(document.getName());
        docDb.setUser(document.getUser());
        docDb.setDeadline(document.getDeadline());
        documentRepository.save(docDb);
    }
}
