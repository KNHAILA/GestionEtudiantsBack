package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.CoursRepository;
import com.gestionEtudiants.Entites.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursMetierImpl implements CoursMetier{
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public Cours saveCours(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public List<Cours> listCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getCours(String motCle) {
        return coursRepository.findById(motCle).orElse(null);
    }
}
