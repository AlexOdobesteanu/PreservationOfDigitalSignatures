package com.serviceltp.web;

import com.serviceltp.web.base.PresProfileType;
import com.serviceltp.web.mail.EmailService;
import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Certificate;
import com.serviceltp.web.models.Document;
import com.serviceltp.web.models.User;
import com.serviceltp.web.services.DocumentService;
import com.serviceltp.web.services.ProfileGeneratorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ScheduledTask {
    @Autowired
    private DocumentService documentService;
    @Autowired
    private EmailService emailService;

    @Scheduled(fixedDelay = 30000)
    public void computeDocuments() throws URISyntaxException, ParseException {
        ProfileGeneratorImpl implGen=new ProfileGeneratorImpl();
        PresProfileType profileActive = implGen.getProfile("active");

        List<Document> allDocs = documentService.getAllDocuments();
        if(!allDocs.isEmpty())
        {
            for (Document doc: allDocs) {
                User userNotified = doc.getUser();
                //for Algos
                Set<Algorithm> algosUsed = doc.getDocumentAlgorithms();
                if(!algosUsed.isEmpty())
                {
                    StringBuilder bodyAlgo = new StringBuilder("Hello, " + userNotified.getUsername() + " !\n\n"
                            + "The following algorithm(s) used to generate the " +
                            "digital signature in the document with the id " + doc.getId() + " became obsolete: ");
                    Set<Algorithm> algosObsolete = new HashSet<>();
                    for (Algorithm algo : algosUsed) {
                        if(algo.getObsolete())
                        {
                            algosObsolete.add(algo);
                            bodyAlgo.append(algo.getName());
                            bodyAlgo.append(" ");
                        }
                    }
                    if(!algosObsolete.isEmpty())
                    {
                        bodyAlgo.append("\nResubmit your document ASAP using the REST API !\n\n" +
                                "The Preservation Profile that you have used is " + profileActive.getPid()+
                                        "\n\nThank you, have a nice day!");
                        // Aici trebuie sa trimit mail de notificare pentru algoritmii obsolete
                        emailService.sendEmail(userNotified.getUsername(),
                                "Algorithm became obsolete - Document " + doc.getId(),bodyAlgo.toString());
                    }
                }

                //For certs
                Set<Certificate> certsEmbedded = doc.getCertificates();
                if(!certsEmbedded.isEmpty())
                {
                    StringBuilder bodyCert = new StringBuilder("Hello, " + userNotified.getUsername() + " !\n\n"
                            + "The following certificate(s) from the certificate chain of the " +
                            "digital signature in the document with the id " + doc.getId() + " expired: ");
                    Date date = new Date();
                    Set<Certificate> certsExpired = new HashSet<>();
                    for (Certificate cert : certsEmbedded) {
                        if(cert.getExpiration_date().before(new Timestamp(date.getTime())))
                        {
                            certsExpired.add(cert);
                            bodyCert.append("\n" +cert.getName() + " |---| Expiration date: " + cert.getExpiration_date().toString());
                        }
                    }
                    if(!certsExpired.isEmpty())
                    {
                        bodyCert.append("\nResubmit your document ASAP using the REST API !\n\n" +
                                "The Preservation Profile that you have used is " + profileActive.getPid()+
                                "\n\nThank you, have a nice day!");

                        // Aici trebuie sa trimit mail de notificare pentru certificatele expirate
                        emailService.sendEmail(userNotified.getUsername(),
                                "Certificate Expired - Document " + doc.getId(),bodyCert.toString());
                    }
                }

            }
        }
    }
}
