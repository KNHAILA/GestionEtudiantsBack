package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.EtudeRepository;
import com.gestionEtudiants.Dao.MatiereRepository;
import com.gestionEtudiants.Entites.Etude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudeMatierImpl implements EtudeMatier{
    @Autowired
    EtudeRepository etudeRepository;
    @Autowired
    MatiereRepository matiereRepository;


    @Override
    public List<String> nomMatires(String cne) {
        List<Etude> etudesDao=etudeRepository.findByCNE(cne);
        List<String> nomMatieres= new ArrayList<String>();
        for(Etude etudeDao : etudesDao) {
            nomMatieres.add(etudeDao.getMatiere().getNom());
        }
        return nomMatieres;
    }

    @Override
    public List<Float> pourcentageMatieres(String cne) {
        List<Etude> etudesDao=etudeRepository.findByCNE(cne);
        List<Float> absPourcentages= new ArrayList<Float>();
        for(Etude etudeDao : etudesDao) {
            absPourcentages.add(Float.valueOf((float) etudeDao.getNbrAbsences()/(float) matiereRepository.getOne(etudeDao.getMatiere().getId()).getNbrHeuresTotal()*100));
        }
        return absPourcentages;
    }
}
