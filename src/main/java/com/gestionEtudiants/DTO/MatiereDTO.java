package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatiereDTO {
    private Integer id;
    private String nom;
    private float note;
}
