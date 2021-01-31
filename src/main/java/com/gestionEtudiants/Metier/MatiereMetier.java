package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Entites.Matiere;

import java.util.List;

public interface MatiereMetier {
    public List<Matiere> listMatieres();
    public String NomMatiere(Integer id);
}
