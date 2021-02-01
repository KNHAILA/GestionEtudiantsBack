package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeDTO {
    private Integer id;
    private String nom;
    private Integer nombre;
    private List<EtudiantDTO> etudiants;
    private boolean open=false;
}
