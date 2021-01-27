package com.gestionEtudiants.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Etudiant extends Personne  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CNE;

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
