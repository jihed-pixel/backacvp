package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class Autre {
    private Integer dureeEE;
    private Integer arretEE;
    private Integer palier;
    private String  motif;
    private String conclusion;
    private Autre(){}

    public Autre(Integer dureeEE, Integer arretEE, Integer palier, String motif, String conclusion) {
        this.dureeEE = dureeEE;
        this.arretEE = arretEE;
        this.palier = palier;
        this.motif = motif;
        this.conclusion = conclusion;
    }

    public Integer getDureeEE() {
        return dureeEE;
    }

    public void setDureeEE(Integer dureeEE) {
        this.dureeEE = dureeEE;
    }

    public Integer getArretEE() {
        return arretEE;
    }

    public void setArretEE(Integer arretEE) {
        this.arretEE = arretEE;
    }

    public Integer getPalier() {
        return palier;
    }

    public void setPalier(Integer palier) {
        this.palier = palier;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
