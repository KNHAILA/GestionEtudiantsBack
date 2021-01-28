package com.gestionEtudiants.Entites;

import javax.persistence.*;

@Entity
public class Etude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="matiere_ID")
    private Matiere matiere;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="etudiant_ID")
    private Etudiant etudiant;

    private float note;
    private int nbrAbsences;
}
