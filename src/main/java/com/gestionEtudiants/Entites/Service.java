package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Service implements Serializable {
    @Id
    private Integer id;
    private  String nom;
    @ManyToOne
    @JoinColumn(name ="matricule")
    private Admin admin;
    @ManyToMany(mappedBy = "services")
    private List<Etudiant> etudiants;
    @OneToMany(mappedBy="semestre",fetch =FetchType.LAZY)
    private List<Matiere> matieresList;
    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<DemandeService> demandeServices;

    public Service() {
    }

    public Service(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
