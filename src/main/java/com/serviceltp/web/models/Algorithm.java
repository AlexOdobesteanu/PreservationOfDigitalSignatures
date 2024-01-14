package com.serviceltp.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "algorithm")
public class Algorithm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Boolean isObsolete;
    @ManyToMany(mappedBy = "documentAlgorithms")
    Set<Document> docs;

    public Algorithm(String signatureAlgName, boolean b) {
        this.name = signatureAlgName;
        this.isObsolete = b;
    }

    public Algorithm(String signatureAlgName, boolean b, Set<Document> docs) {
        this.name = signatureAlgName;
        this.isObsolete = b;
        this.docs = docs;
    }

    public void addDoc(Document doc)
    {
        this.docs.add(doc);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getObsolete() {
        return isObsolete;
    }

    public void setObsolete(Boolean obsolete) {
        isObsolete = obsolete;
    }

    public Set<Document> getDocs() {
        return docs;
    }

    public void setDocs(Set<Document> docs) {
        this.docs = docs;
    }
}
