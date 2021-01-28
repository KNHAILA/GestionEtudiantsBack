package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.DemandeServiceRepository;
import com.gestionEtudiants.Entites.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeServiceMetierImpl implements DemandeServiceMetier {
    @Autowired
    private DemandeServiceRepository demandeServiceRepository;
    @Override
    public DemandeService saveDemandeService(DemandeService c) {
        return demandeServiceRepository.save(c);
    }

    @Override
    public List<DemandeService> listDemandeService() {
        return demandeServiceRepository.findAll();
    }
}
