package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.Etude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudeRepository extends JpaRepository<Etude,Integer> {
    @Query("select etude from Etude etude where etude.etudiant.CNE  = :cne")
    List<Etude> findByCNE(@Param("cne") String cne);
}
