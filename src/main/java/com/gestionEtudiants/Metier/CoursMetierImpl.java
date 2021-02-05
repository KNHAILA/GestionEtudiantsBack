package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.PostCoursDTO;
import com.gestionEtudiants.Dao.AdminRepository;
import com.gestionEtudiants.Dao.CoursRepository;
import com.gestionEtudiants.Entites.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursMetierImpl implements CoursMetier{
    @Autowired
    private CoursRepository coursRepository;
    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Cours saveCours(PostCoursDTO c) {
        Cours c1 =new Cours();
        c1.setDescription(c.getDescription());
        c1.setMotCle(c.getMotCle());
        c1.setNom(c.getNom());
        c1.setPdfLink(c.getPdfLink());
        c1.setAdmin(adminRepository.findById(c.getMatricule()).get());
        return coursRepository.save(c1);
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
