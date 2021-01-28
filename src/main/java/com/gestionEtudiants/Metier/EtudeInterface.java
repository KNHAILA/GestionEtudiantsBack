package com.gestionEtudiants.Metier;

import com.gestionEtudiants.Entites.Etude;

import java.util.List;

public interface EtudeInterface {
    public Etude getEtude(Integer id);
    public List<Etude> getListEtudes();
}
