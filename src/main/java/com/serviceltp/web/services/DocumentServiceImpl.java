package com.serviceltp.web.services;

import com.serviceltp.web.models.Document;
import com.serviceltp.web.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }
    @Override
    public void updateDocument(Document document, Long documentId) {
        Document docDb = documentRepository.findById(documentId).orElseThrow();
        docDb.setName(document.getName());
        docDb.setUser(document.getUser());
        docDb.setCertificates(document.getCertificates());
        docDb.setDocumentAlgorithms(document.getDocumentAlgorithms());
        documentRepository.save(docDb);
    }
    @Override
    public Document getById(long id) {
        return documentRepository.getReferenceById(id);
    }

    @Override
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}
