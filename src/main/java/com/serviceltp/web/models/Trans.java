package com.serviceltp.web.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_trans")
public class Trans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String hash;
    private Date creation_date;
    @ManyToOne
    private User user;
    @OneToOne
    private Document document;

    public Trans(String transactionHash, Date format, User currentUser, Document docRetrieved) {
        this.hash = transactionHash;
        this.creation_date= format;
        this.user=currentUser;
        this.document= docRetrieved;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
