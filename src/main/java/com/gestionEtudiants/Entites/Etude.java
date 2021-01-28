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

}
