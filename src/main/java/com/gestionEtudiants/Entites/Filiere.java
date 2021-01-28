package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Filiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy="filiere",fetch =FetchType.LAZY)
    private List<AnneeFiliere> anneeFiliereList;

    public Filiere() {
    }

    public Filiere(Long id, String nom) {
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
