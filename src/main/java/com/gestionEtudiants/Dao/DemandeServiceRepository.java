package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.DemandeService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeServiceRepository extends JpaRepository<DemandeService, Integer> {
}
