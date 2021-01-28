package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.EtudiantRepository;
import com.gestionEtudiants.Entites.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantMetierImpl implements EtudiantMetier{
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant getEtudiant(String cne) {
        return etudiantRepository.getOne(cne);
    }
}
