package com.gestionEtudiants.Services;


import com.gestionEtudiants.DTO.PostCoursDTO;
import com.gestionEtudiants.Entites.Cours;
import com.gestionEtudiants.Entites.DemandeService;
import com.gestionEtudiants.Metier.CoursMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/Cours")
public class CoursRestService {
    @Autowired
    private CoursMetier coursMetier;
    @GetMapping("get/{motCle}")
    public Cours getCoursByMotCle(@PathVariable String motCle)
    {
        return coursMetier.getCours(motCle);
    }
    @GetMapping("list")
    public List<Cours> getAllCours()
    {
        return coursMetier.listCours();
    }
    @PostMapping("add")
    public Cours addCours(@RequestBody PostCoursDTO c){
        return coursMetier.saveCours(c);
    }
}
