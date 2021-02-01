package com.gestionEtudiants.Services;

import com.gestionEtudiants.Metier.AdminMetier;
import com.gestionEtudiants.Metier.EtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Utilisateur")
public class PersonneRestService {
    @Autowired
    private EtudiantMetier etudiantMetier;
    @Autowired
    private AdminMetier adminMetier;

    @GetMapping("id/password/{id}/{password}")
    public String checkUserIfExists(@PathVariable String id, @PathVariable String password){
        if(adminMetier.getAminByMatriculeAndPassword(id,password)==true)
            return "admin";
        else if(etudiantMetier.getAminByCneAndPassword(id,password)==true)
            return "student";
        else
            return "DoesExist";
    }
}
