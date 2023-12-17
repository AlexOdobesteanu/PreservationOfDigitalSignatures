package com.serviceltp.web;

import eu.europa.esig.dss.model.x509.CertificateToken;
import eu.europa.esig.dss.spi.x509.CommonTrustedCertificateSource;
import org.springframework.http.server.DelegatingServerHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class LoadedCerts {
    private static LoadedCerts single_instance = null;

    // Declaring a variable of type String
    public CommonTrustedCertificateSource trustedCertSource;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private LoadedCerts() throws IOException, CertificateException {
        this.trustedCertSource=new CommonTrustedCertificateSource();
        File dir=new File("./trustcerts");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                Path filePath=Paths.get(String.valueOf(child));
                byte[] fileBytes= Files.readAllBytes(filePath);
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ByteArrayInputStream inputStream=new ByteArrayInputStream(fileBytes);
                X509Certificate x509cert=(X509Certificate) certificateFactory.generateCertificate(inputStream);
                CertificateToken certToken=new CertificateToken(x509cert);
                this.trustedCertSource.addCertificate(certToken);
            }
        }
        else
        {
            System.out.println(Paths.get(".").toAbsolutePath());
        }


    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized LoadedCerts getInstance() throws CertificateException, IOException {
        if (single_instance == null)
            single_instance = new LoadedCerts();

        return single_instance;
    }
}
