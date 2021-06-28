package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class ExamenClinique {
    private Integer poids;
    private Integer taille;
    private Double sc;
    private String ta;
    private Boolean ac;
    private ExamenClinique() {
    }

    public ExamenClinique(Integer poids, Integer taille, Double sc, String ta, Boolean ac) {
        this.poids = poids;
        this.taille = taille;
        this.sc = sc;
        this.ta = ta;
        this.ac = ac;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Double getSc() {
        return sc;
    }

    public void setSc(Double sc) {
        this.sc = sc;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }
}
