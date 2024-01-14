package com.serviceltp.web.repository;

import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlgorithmRepository extends JpaRepository<Algorithm,Long> {
    Algorithm findAlgorithmByName(String name);
}
