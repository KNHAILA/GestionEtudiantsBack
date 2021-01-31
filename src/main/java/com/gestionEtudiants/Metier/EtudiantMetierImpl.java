package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.EtudiantRepository;
import com.gestionEtudiants.Entites.Admin;
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

    @Override
    public boolean getAminByCneAndPassword(String cne, String password) {
        Etudiant etud=etudiantRepository.getOne(cne);
        if(etud!=null && etud.getPassword()==password)
            return true;
        return false;
    }


}
