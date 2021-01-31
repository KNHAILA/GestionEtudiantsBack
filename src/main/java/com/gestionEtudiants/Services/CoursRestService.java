package com.gestionEtudiants.Services;


import com.gestionEtudiants.Entites.Cours;
import com.gestionEtudiants.Metier.CoursMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cours")
public class CoursRestService {
    @Autowired
    private CoursMetier coursMetier;
    @GetMapping("get/{motCle}")
    public Cours getCoursByMotCle(@RequestParam String motCle)
    {
        return coursMetier.getCours(motCle);
    }
}
