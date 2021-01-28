package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Entites.Cours;
import com.gestionEtudiants.Entites.DemandeService;

import java.util.List;

public interface DemandeServiceMetier {
    public DemandeService saveDemandeService(DemandeService c);
    public List<DemandeService> listDemandeService();
}
