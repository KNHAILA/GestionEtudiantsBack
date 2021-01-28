package com.gestionEtudiants.Entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class EmploiTemps implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pdfLink;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AnneeFiliere_Id", nullable = false)
    private AnneeFiliere anneeFiliere;
    public EmploiTemps() {
        super();
    }

    public EmploiTemps(Integer id, String pdfLink) {
        super();
        this.id = id;
        this.pdfLink = pdfLink;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }
}
