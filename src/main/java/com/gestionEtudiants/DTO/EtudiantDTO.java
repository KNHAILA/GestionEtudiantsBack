package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDTO {
    private String cne;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String plusInfo;
    private String classe;
    private boolean open=false;
}
