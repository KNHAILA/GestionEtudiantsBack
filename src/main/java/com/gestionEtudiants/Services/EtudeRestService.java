package com.gestionEtudiants.Services;

import com.gestionEtudiants.DTO.EtudeNotesDTO;
import com.gestionEtudiants.Entites.Cours;
import com.gestionEtudiants.Metier.EtudeMatier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/Etude")
public class EtudeRestService {
    @Autowired
    private EtudeMatier etudeMatier;
    @GetMapping("listNomMatieres/{cne}")
    public List<String> getAllMatieres(@PathVariable String cne)
    {
        return etudeMatier.nomMatires(cne);
    }
    @GetMapping("listPourcentages/{cne}")
    public List<Float> getPourcentages(@PathVariable String cne)
    {
        return etudeMatier.pourcentageMatieres(cne);
    }
    @GetMapping("listNotes/{cne}")
    public List<EtudeNotesDTO> getNotes(@PathVariable String cne)
    {
        return etudeMatier.getNotes(cne);
    }
}
