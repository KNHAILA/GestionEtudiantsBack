package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.DemandeService;
import com.gestionEtudiants.Entites.EmploiTemps;
import com.gestionEtudiants.Entites.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
    @Query("select matiere from Matiere matiere where matiere.semestre.id  = :id")
    List<Matiere> findByIdSemestre(@Param("id") Integer id);
}
