package com.gestionEtudiants.Services;

import com.gestionEtudiants.Metier.AdminMetier;
import com.gestionEtudiants.Metier.EtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Utilisateur")
public class PersonneRestService {
    @Autowired
    private EtudiantMetier etudiantMetier;
    @Autowired
    private AdminMetier adminMetier;

    @GetMapping("id/password/{id}/{password}")
    public String checkUserIfExists(@RequestParam String id, @RequestParam String password){
        if(adminMetier.getAminByMatriculeAndPassword(id,password)==true)
            return "admin";
        else if(etudiantMetier.getAminByCneAndPassword(id,password)==true)
            return "student";
        else
            return "DoesExist";
    }
}
