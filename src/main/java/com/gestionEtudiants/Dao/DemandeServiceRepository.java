package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.DemandeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeServiceRepository extends JpaRepository<DemandeService, Integer> {
    @Query("select demandeService from DemandeService demandeService where demandeService.service.id  = :id")
    List<DemandeService> findByIdService(@Param("id") Integer id);
}
