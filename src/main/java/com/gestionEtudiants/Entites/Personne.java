package com.gestionEtudiants.Entites;

import java.io.Serializable;
import java.util.Date;


public class Personne implements Serializable {
    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;

    public Personne() {
        super();
    }

    public Personne(String nom, String prenom, String email, Date dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
