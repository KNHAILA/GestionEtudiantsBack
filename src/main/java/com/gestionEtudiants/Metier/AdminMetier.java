package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Entites.Admin;

public interface AdminMetier {
    public boolean getAminByMatriculeAndPassword(String matricule, String password);
    public Admin addAdmin(Admin admin);
}
