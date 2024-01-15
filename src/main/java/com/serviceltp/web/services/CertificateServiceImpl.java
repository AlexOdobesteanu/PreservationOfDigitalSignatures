package com.serviceltp.web.services;

import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Certificate;
import com.serviceltp.web.repository.AlgorithmRepository;
import com.serviceltp.web.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateServiceImpl implements CertificateService {
    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }
    @Override
    public void updateCertificate(Certificate certificate, Long certificateId) {
        Certificate certDb = certificateRepository.findById(certificateId).orElseThrow();
        certDb.setName(certificate.getName());
        certDb.setDocument(certificate.getDocument());
        certDb.setExpiration_date(certificate.getExpiration_date());
        certificateRepository.save(certDb);
    }

    @Override
    public void deleteCertificate(Certificate certificate) {
        certificateRepository.delete(certificate);
    }
}
