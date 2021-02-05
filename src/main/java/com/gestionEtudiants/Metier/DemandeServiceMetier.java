package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.DemandeDTO;
import com.gestionEtudiants.DTO.PostDemandeDTO;
import com.gestionEtudiants.Entites.Cours;
import com.gestionEtudiants.Entites.DemandeService;

import java.util.List;

public interface DemandeServiceMetier {
    public DemandeService saveDemandeService(PostDemandeDTO c);
    public List<DemandeService> listDemandeService();
    public List<DemandeDTO> getAllDemandes();
}
