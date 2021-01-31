package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.MatiereRepository;
import com.gestionEtudiants.Entites.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereMetierImpl implements MatiereMetier{
    @Autowired
    private MatiereRepository matiereRepository;
    @Override
    public List<Matiere> listMatieres() {
        return matiereRepository.findAll();
    }

    @Override
    public String NomMatiere(Integer id) {
        return matiereRepository.getOne(id).getNom();
    }
}
