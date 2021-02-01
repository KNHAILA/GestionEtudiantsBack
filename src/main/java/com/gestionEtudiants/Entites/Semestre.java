package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Semestre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy="semestre",fetch =FetchType.LAZY)
    private List<Matiere> matieresList;
    private String nom;

    public Semestre() {
        super();
    }

    public Semestre(Integer id,String nom) {
        super();
        this.id = id;
        this.nom=nom;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
