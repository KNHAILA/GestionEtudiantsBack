package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Entites.Etudiant;

public interface EtudiantMetier {
    public Etudiant getEtudiant(String cne);
    public boolean getAminByCneAndPassword(String cne, String password);
}
