package com.gestionEtudiants.Services;
import com.gestionEtudiants.Entites.EmploiTemps;
import com.gestionEtudiants.Metier.EmploiTempsMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/EmploiTemps")
public class EmploiTempsRestService {
    @Autowired
    private EmploiTempsMetier emploiTempsMetier;
    @GetMapping("list")
    public List<EmploiTemps> listEmploisTemps() {
        return emploiTempsMetier.listEmploisTemps();
    }
}
