package com.gestionEtudiants.Services;

import com.gestionEtudiants.Entites.Matiere;
import com.gestionEtudiants.Metier.MatiereMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Matiere")
public class MatiereRestService {
    @Autowired
    private MatiereMetier matiereMetier;
    @GetMapping("list")
    public List<Matiere> listMatiere()
    {
        return matiereMetier.listMatieres();
    }

}
