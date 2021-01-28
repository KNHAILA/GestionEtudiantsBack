package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Admin extends Personne implements Serializable {
    @Id
    private String matricule;
    @OneToMany(mappedBy="admin",fetch =FetchType.LAZY)
    private List<Cours> coursList;
    @OneToMany(mappedBy="admin",fetch =FetchType.LAZY)
    private List<Service> serviceList;
    @ManyToOne
    @JoinColumn(name = "appartient")
    private Departement departement;

    public Admin() {
    }

    public Admin(String nom, String prenom, String email, Date dateNaissance, String matricule) {
        super(nom, prenom, email, dateNaissance);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
