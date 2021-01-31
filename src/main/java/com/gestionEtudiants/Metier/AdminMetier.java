package com.gestionEtudiants.Metier;

public interface AdminMetier {
    public boolean getAminByMatriculeAndPassword(String matricule, String password);
}
