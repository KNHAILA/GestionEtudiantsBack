package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CNE;
    @ManyToMany
    @JoinTable(name = "ETUD_SERV")
    private List<Service> services;
    @ManyToMany(mappedBy = "etudiants")
    private List<Cours> coursList;
    @ManyToOne
    @JoinColumn(name = "filiere_ID")
    private Filiere filiere;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Etude> etudes;

    public Etudiant() {
        super();
    }

    public Etudiant(String nom, String prenom, String email, Date dateNaissance, String CNE) {
        super(nom, prenom, email, dateNaissance);
        this.CNE = CNE;
    }

    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }
}
