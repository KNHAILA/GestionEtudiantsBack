package com.gestionEtudiants.Services;


import com.gestionEtudiants.Dao.AnneeFiliereRepository;
import com.gestionEtudiants.Entites.AnneeFiliere;
import com.gestionEtudiants.Metier.AnneeFiliereMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/FiliereAnnees")
public class AnneeFiliereRestService {
    @Autowired
    AnneeFiliereMetier anneeFiliereMetier;
    @GetMapping("list")
    public List<AnneeFiliere> anneeFiliereList(){
        return anneeFiliereMetier.listAnnees();
    }

}
