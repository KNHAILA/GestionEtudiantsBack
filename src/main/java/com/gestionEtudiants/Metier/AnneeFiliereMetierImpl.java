package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.AnneeFiliereRepository;
import com.gestionEtudiants.Entites.AnneeFiliere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnneeFiliereMetierImpl implements AnneeFiliereMetier{
    @Autowired
    AnneeFiliereRepository anneeFiliereRepository;
    @Override
    public List<AnneeFiliere> listAnnees() {
        return anneeFiliereRepository.findAll();
    }
}
