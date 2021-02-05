package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.PostCoursDTO;
import com.gestionEtudiants.Entites.Cours;

import java.util.List;

public interface CoursMetier {
    public Cours saveCours(PostCoursDTO c);
    public List<Cours> listCours();
    public Cours getCours(String motCle);
}
