package com.gestionEtudiants.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "anneeFiliere")
    private EmploiTemps emploiTemps;
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
    @JsonIgnore
    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    @JsonIgnore
    public EmploiTemps getEmploiTemps() {
        return emploiTemps;
    }

    public void setEmploiTemps(EmploiTemps emploiTemps) {
        this.emploiTemps = emploiTemps;
    }
}
