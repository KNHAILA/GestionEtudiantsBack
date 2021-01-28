package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DemandeService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="service_ID")
    private Service service;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="etudiant_ID")
    private Etudiant etudiant;

    private Date annee;
    private String description;
}
