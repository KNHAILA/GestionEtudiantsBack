package com.gestionEtudiants.Services;

import com.gestionEtudiants.Entites.Admin;
import com.gestionEtudiants.Entites.Etudiant;
import com.gestionEtudiants.Metier.EtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*", maxAge=3600)

@RestController
@RequestMapping("/Etudiant")
public class EtudiantRestService {
    @Autowired
    private EtudiantMetier etudiantMetier;

    @PostMapping("add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantMetier.addEtudiant(etudiant);
    }

}