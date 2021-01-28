package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.ServiceRepository;
import com.gestionEtudiants.Entites.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceMetierImpl implements ServiceMetier{
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public List<Service> listService() {
        return serviceRepository.findAll();
    }
}
