package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.AdminRepository;
import com.gestionEtudiants.Entites.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminMetierImpl implements AdminMetier{
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public boolean getAminByMatriculeAndPassword(String matricule, String password) {
        Admin admin=null;
        admin=adminRepository.findById(matricule).orElse(null);
        if(admin!=null && admin.getPassword().equals(password))
            return true;
        return false;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
