package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String motCle;
    private String nom;
    private  String description;
    private String pdfLink;
    @ManyToOne
    @JoinColumn(name = "gerer")
    private Admin admin;
    @ManyToMany
    @JoinTable(name ="ETUD_CRS")
    private List<Etudiant> etudiants;
    public Cours() {
    }

    public Cours(String motCle, String nom, String description, String pdfLink) {
        this.motCle = motCle;
        this.nom = nom;
        this.description = description;
        this.pdfLink = pdfLink;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }
}
