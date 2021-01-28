package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.EmploiTempsRepository;
import com.gestionEtudiants.Entites.EmploiTemps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmploiTempsMetierImpl implements EmploiTempsMetier{
    @Autowired
    private EmploiTempsRepository emploiTempsRepository;
    @Override
    public List<EmploiTemps> listEmploisTemps() {
        return emploiTempsRepository.findAll();
    }
}
