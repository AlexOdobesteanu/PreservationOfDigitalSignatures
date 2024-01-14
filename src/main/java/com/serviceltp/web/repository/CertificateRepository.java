package com.serviceltp.web.repository;

import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate,Long> {

}
