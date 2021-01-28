package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Service implements Serializable {
    @Id
    private Long id;
    private  String nom;
    @ManyToOne
    @JoinColumn(name = "traiter")
    private Admin admin;
    @ManyToMany(mappedBy = "services")
    private List<Etudiant> etudiants;


    public Service() {
    }

    public Service(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
