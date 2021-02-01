package com.gestionEtudiants.Metier;

import com.gestionEtudiants.DTO.EtudeNotesDTO;
import com.gestionEtudiants.DTO.MatiereDTO;
import com.gestionEtudiants.Dao.EtudeRepository;
import com.gestionEtudiants.Dao.MatiereRepository;
import com.gestionEtudiants.Dao.SemestreRepository;
import com.gestionEtudiants.Entites.Etude;
import com.gestionEtudiants.Entites.Matiere;
import com.gestionEtudiants.Entites.Semestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudeMatierImpl implements EtudeMatier{
    @Autowired
    private EtudeRepository etudeRepository;
    @Autowired
    private MatiereRepository matiereRepository;
    @Autowired
    private SemestreRepository semestreRepository;


    @Override
    public List<String> nomMatires(String cne) {
        List<Etude> etudesDao=etudeRepository.findByCNE(cne);
        List<String> nomMatieres= new ArrayList<String>();
        for(Etude etudeDao : etudesDao) {
            nomMatieres.add(etudeDao.getMatiere().getNom());
        }
        return nomMatieres;
    }

    @Override
    public List<Float> pourcentageMatieres(String cne) {
        List<Etude> etudesDao=etudeRepository.findByCNE(cne);
        List<Float> absPourcentages= new ArrayList<Float>();
        for(Etude etudeDao : etudesDao) {
            absPourcentages.add(Float.valueOf((float) etudeDao.getNbrAbsences()/(float) matiereRepository.getOne(etudeDao.getMatiere().getId()).getNbrHeuresTotal()*100));
        }
        return absPourcentages;
    }
    @Override
    public List<EtudeNotesDTO> getNotes(String cne){
        List<EtudeNotesDTO> etudeNotesDTOList=new ArrayList<EtudeNotesDTO>();
        List<Semestre> listSemestres=semestreRepository.findAll();
        for(Semestre semestre: listSemestres)
        {
            List<Matiere> matieres=matiereRepository.findByIdSemestre(semestre.getId());
            for(Matiere matiere: matieres)
            {
                List<Etude> listEtude=etudeRepository.findByCneAndIdMatiere(cne,matiere.getId());
                if(listEtude.size()>0)
                {
                    EtudeNotesDTO etudeNotesDTO=new EtudeNotesDTO();
                    etudeNotesDTO.setId(semestre.getId());
                    etudeNotesDTO.setCode(semestre.getNom());
                    List<MatiereDTO> matieresDTO=new ArrayList<MatiereDTO>();
                    for(Etude etude: listEtude)
                    {
                        MatiereDTO matiereDTO=new MatiereDTO();
                        matiereDTO.setId(matiere.getId());
                        matiereDTO.setNom(matiere.getNom());
                        matiereDTO.setNote(etude.getNote());
                        matieresDTO.add(matiereDTO);
                    }
                    etudeNotesDTO.setMatieres(matieresDTO);
                    etudeNotesDTOList.add(etudeNotesDTO);
                }
            }
        }
        return etudeNotesDTOList;
    }
}
