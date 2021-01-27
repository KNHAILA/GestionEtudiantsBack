package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.EmploiTemps;
import com.gestionEtudiants.Entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
}
