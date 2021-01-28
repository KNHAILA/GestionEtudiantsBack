package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant extends Personne implements Serializable {
    @Id
    private String CNE;
    @ManyToMany
    @JoinTable(name = "DemandeService")
    private List<Service> services;
    @ManyToOne
    @JoinColumn(name = "filiere_ID")
    private Filiere filiere;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Etude> etudes;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<DemandeService> demandeServices;

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
