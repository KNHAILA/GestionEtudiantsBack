package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDemandeDTO {
    private Integer id;
    private String cne;
    private Integer service;
    private String  description;
    private String annee;
}
