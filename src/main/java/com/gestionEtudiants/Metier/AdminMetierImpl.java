package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Dao.AdminRepository;
import com.gestionEtudiants.Entites.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminMetierImpl implements AdminMetier{
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public boolean getAminByMatriculeAndPassword(String matricule, String password) {
        Admin admin=adminRepository.getOne(matricule);
        if(admin!=null && admin.getPassword()==password)
            return true;
        return false;
    }
}
