package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.EmploiTemps;
import com.gestionEtudiants.Entites.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
}
