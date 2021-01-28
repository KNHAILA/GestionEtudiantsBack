package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant extends Personne  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CNE;
    @ManyToMany
    @JoinTable(name = "ETUD_SERV")
    private List<Service> services;
    @ManyToMany(mappedBy = "etudiants")
    private List<Cours> coursList;

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
