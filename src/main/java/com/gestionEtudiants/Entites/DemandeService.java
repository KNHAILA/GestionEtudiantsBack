package com.gestionEtudiants.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class DemandeService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    @ManyToOne
    @JoinColumn(name="service_ID")
    private Service service;

    @ManyToOne
    @JoinColumn(name="etudiant_ID")
    @JsonIgnore
    private Etudiant etudiant;

    private String annee;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
@JoinTable
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
