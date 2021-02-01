package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.EtudeNotesDTO;

import java.util.List;

public interface EtudeMatier {
    public List<String> nomMatires(String cne);
    public List<Float> pourcentageMatieres(String cne);
    public List<EtudeNotesDTO> getNotes(String cne);
}
