package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AnneeFiliere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String annee;
    @ManyToOne
    @JoinColumn(name = "filiere_ID")
    private Filiere filiere;

    public AnneeFiliere() {
    }

    public AnneeFiliere(Long id, String annee) {
        this.id = id;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
