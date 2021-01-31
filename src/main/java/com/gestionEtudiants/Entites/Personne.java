package com.gestionEtudiants.Entites;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;
@MappedSuperclass
public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Date dateNaissance;

    public Personne() {
        super();
    }

    public Personne(String nom, String prenom, String email,String password, Date dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
