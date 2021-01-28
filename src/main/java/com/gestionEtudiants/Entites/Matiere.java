package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private int nbrHeuresTotal;
    private int nbrHeuresCours;
    private int nbrHeuresTDs;
    private int nbrHeuresTPs;
    @ManyToOne
    @JoinColumn(name = "semestre_ID")
    private Semestre semestre;
    @OneToMany(mappedBy = "matiere", cascade = CascadeType.ALL)
    private List<Etude> etudes;

    public Matiere() {
        super();
    }

    public Matiere(Integer id, String nom, int nbrHeuresTotal, int nbrHeuresCours, int nbrHeuresTDs, int nbrHeuresTPs) {
        super();
        this.id = id;
        this.nom = nom;
        this.nbrHeuresTotal = nbrHeuresTotal;
        this.nbrHeuresCours = nbrHeuresCours;
        this.nbrHeuresTDs = nbrHeuresTDs;
        this.nbrHeuresTPs = nbrHeuresTPs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrHeuresTotal() {
        return nbrHeuresTotal;
    }

    public void setNbrHeuresTotal(int nbrHeuresTotal) {
        this.nbrHeuresTotal = nbrHeuresTotal;
    }

    public int getNbrHeuresCours() {
        return nbrHeuresCours;
    }

    public void setNbrHeuresCours(int nbrHeuresCours) {
        this.nbrHeuresCours = nbrHeuresCours;
    }

    public int getNbrHeuresTDs() {
        return nbrHeuresTDs;
    }

    public void setNbrHeuresTDs(int nbrHeuresTDs) {
        this.nbrHeuresTDs = nbrHeuresTDs;
    }

    public int getNbrHeuresTPs() {
        return nbrHeuresTPs;
    }

    public void setNbrHeuresTPs(int nbrHeuresTPs) {
        this.nbrHeuresTPs = nbrHeuresTPs;
    }
}
