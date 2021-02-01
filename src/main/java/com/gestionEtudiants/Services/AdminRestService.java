package com.gestionEtudiants.Services;

import com.gestionEtudiants.Entites.Admin;
import com.gestionEtudiants.Metier.AdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
