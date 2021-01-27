package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.EmploiTemps;
import com.gestionEtudiants.Entites.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemestreRepository extends JpaRepository<Semestre, Integer> {
}
