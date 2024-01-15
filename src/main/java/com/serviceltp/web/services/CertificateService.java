package com.serviceltp.web.services;

import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Certificate;

public interface CertificateService {
    Certificate saveCertificate(Certificate certificate);
    void updateCertificate(Certificate certificate, Long certificateId);
    void deleteCertificate(Certificate certificate);
}
