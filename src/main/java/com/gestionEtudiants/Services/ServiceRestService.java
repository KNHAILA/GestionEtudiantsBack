package com.gestionEtudiants.Services;

import com.gestionEtudiants.Entites.Service;
import com.gestionEtudiants.Metier.ServiceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/Service")
public class ServiceRestService {
    @Autowired
    ServiceMetier serviceMetier;
    @GetMapping("list")
public List<Service> serviceList(){
        return serviceMetier.listService();
    }
}
