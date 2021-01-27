package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
