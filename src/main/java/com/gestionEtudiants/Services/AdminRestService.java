package com.gestionEtudiants.Services;

import com.gestionEtudiants.Entites.Admin;
import com.gestionEtudiants.Metier.AdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/Admin")
public class AdminRestService {
    @Autowired
    private AdminMetier adminMetier;
    
    @PostMapping("add")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminMetier.addAdmin(admin);
    }
    
}
