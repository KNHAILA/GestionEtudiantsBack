package com.gestionEtudiants.Metier;

import java.util.List;

public interface EtudeMatier {
    public List<String> nomMatires(String cne);
    public List<Float> pourcentageMatieres(String cne);
}
