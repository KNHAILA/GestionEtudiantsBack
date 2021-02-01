package com.gestionEtudiants.Services;

import com.gestionEtudiants.DTO.DemandeDTO;
import com.gestionEtudiants.Entites.DemandeService;
import com.gestionEtudiants.Metier.DemandeServiceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DemandeService")
public class DemandeServiceRestService {
    @Autowired
    private DemandeServiceMetier demandeServiceMetier;

    @PostMapping("add")
    public DemandeService addADemandeService(@RequestBody DemandeService demandeService){
        return demandeServiceMetier.saveDemandeService(demandeService);
    }
    @GetMapping("list")
    public List<DemandeDTO> getAllDemandes()
    {
        return demandeServiceMetier.getAllDemandes();
    }
}
