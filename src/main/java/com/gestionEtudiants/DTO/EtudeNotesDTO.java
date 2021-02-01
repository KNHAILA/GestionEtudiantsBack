package com.gestionEtudiants.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtudeNotesDTO {
    private Integer id;
    private String code;
    private boolean open=false;
    private List<MatiereDTO> matieres;
}
