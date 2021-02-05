package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCoursDTO {
    private String motCle;
    private String nom;
    private String description;
    private String pdfLink;
    private String matricule;
}
