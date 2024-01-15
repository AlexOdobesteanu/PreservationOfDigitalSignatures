package com.serviceltp.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.formatter.qual.Format;
import org.checkerframework.checker.units.qual.Force;

import java.util.Date;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private User user;
    private String name;
    //Add many to many with Algorithm
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="document_algos",
            joinColumns = @JoinColumn(name="document_id"),
            inverseJoinColumns = @JoinColumn(name="algo_id"))
    Set<Algorithm> documentAlgorithms;
    //Add Certificates and one-to-many relationship
    @OneToMany(mappedBy = "document",fetch = FetchType.EAGER)
    private Set<Certificate> certificates;

    public Document(User currentUser, String name) {
        this.user = currentUser;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Algorithm> getDocumentAlgorithms() {
        return documentAlgorithms;
    }

    public void setDocumentAlgorithms(Set<Algorithm> documentAlgorithms) {
        this.documentAlgorithms = documentAlgorithms;
    }

    public Set<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }
}
