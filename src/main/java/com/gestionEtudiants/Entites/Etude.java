package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Etude implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="matiere_ID")
    private Matiere matiere;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="etudiant_ID")
    private Etudiant etudiant;

    private float note;
    private int nbrAbsences;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getNbrAbsences() {
        return nbrAbsences;
    }

    public void setNbrAbsences(int nbrAbsences) {
        this.nbrAbsences = nbrAbsences;
    }
}
