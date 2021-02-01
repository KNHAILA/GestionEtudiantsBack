package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.DemandeDTO;
import com.gestionEtudiants.DTO.EtudiantDTO;
import com.gestionEtudiants.Dao.AnneeFiliereRepository;
import com.gestionEtudiants.Dao.DemandeServiceRepository;
import com.gestionEtudiants.Dao.EtudiantRepository;
import com.gestionEtudiants.Dao.ServiceRepository;
import com.gestionEtudiants.Entites.DemandeService;
import com.gestionEtudiants.Entites.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemandeServiceMetierImpl implements DemandeServiceMetier {
    @Autowired
    private DemandeServiceRepository demandeServiceRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private AnneeFiliereRepository anneeFiliereRepository;
    @Override
    public DemandeService saveDemandeService(DemandeService c) {
        return demandeServiceRepository.save(c);
    }

    @Override
    public List<DemandeService> listDemandeService() {
        return demandeServiceRepository.findAll();
    }

    public List<DemandeDTO> getAllDemandes()
    {
        List<DemandeDTO> demandes=new ArrayList<DemandeDTO>();
        List<DemandeService> listDemandeService=demandeServiceRepository.findAll();
        List<com.gestionEtudiants.Entites.Service> listServices=serviceRepository.findAll();
        for(com.gestionEtudiants.Entites.Service service: listServices)
        {
            List<DemandeService> list=demandeServiceRepository.findByIdService(service.getId());
            List<EtudiantDTO> etudiantsDTO=new ArrayList<EtudiantDTO>();
            if(list.size()>0)
            {
                DemandeDTO demandeDTO=new DemandeDTO();
                demandeDTO.setId(service.getId());
                demandeDTO.setNom(service.getNom());
                demandeDTO.setNombre(list.size());
                for(DemandeService demandeService:list)
                {
                    Etudiant etudiant=etudiantRepository.getOne(demandeService.getEtudiant().getCNE());
                    EtudiantDTO etudiantDTO=new EtudiantDTO();
                    etudiantDTO.setNom(etudiant.getNom());
                    etudiantDTO.setPrenom(etudiant.getPrenom());
                    etudiantDTO.setDateNaissance(etudiant.getDateNaissance());
                    etudiantDTO.setEmail(etudiant.getEmail());
                    etudiantDTO.setClasse(demandeService.getAnnee());
                    etudiantsDTO.add(etudiantDTO);
                }
                demandeDTO.setEtudiants(etudiantsDTO);
                demandes.add(demandeDTO);
            }
        }
        return demandes;
    }
}
