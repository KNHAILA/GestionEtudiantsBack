package com.gestionEtudiants.Services;

import com.gestionEtudiants.DTO.DemandeDTO;
import com.gestionEtudiants.DTO.PostDemandeDTO;
import com.gestionEtudiants.Entites.DemandeService;
import com.gestionEtudiants.Metier.DemandeServiceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*", maxAge=3600)

@RestController
@RequestMapping("/DemandeService")
public class DemandeServiceRestService {
    @Autowired
    private DemandeServiceMetier demandeServiceMetier;

    @PostMapping("add")
    public DemandeService addADemandeService(@RequestBody PostDemandeDTO postDemandeDTO){
       return demandeServiceMetier.saveDemandeService(postDemandeDTO);

    }
    @GetMapping("list")
    public List<DemandeDTO> getAllDemandes()
    {
        return demandeServiceMetier.getAllDemandes();
    }
}
