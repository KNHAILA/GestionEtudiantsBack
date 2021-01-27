package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
