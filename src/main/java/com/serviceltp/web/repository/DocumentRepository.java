package com.serviceltp.web.repository;

import com.serviceltp.web.models.Document;
import com.serviceltp.web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findByUser(User user);
}
