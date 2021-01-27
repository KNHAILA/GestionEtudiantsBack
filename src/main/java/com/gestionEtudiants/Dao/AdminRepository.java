package com.gestionEtudiants.Dao;

import com.gestionEtudiants.Entites.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
