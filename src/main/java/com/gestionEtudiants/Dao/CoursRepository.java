package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, String> {
}
