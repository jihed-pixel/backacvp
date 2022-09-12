package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class ExamenClinique {
    private Integer poids;
    private Integer taille;
    private Double sc;
    private Float pas;
    private Float pad;
    private Float pas2;
    private Float pad2;
    private Boolean ac;
    private String bruit;
    private String anormale;
    private Boolean souf;
    private String preciseSouf;
    private Boolean poul;
    private String precisePoul;
    private Boolean peripherique;
    private Boolean varices;
    private String fc;
    private String rythme;
    private  String siege;
    private Boolean reflux;
    private Boolean siege2;
    private ExamenClinique() {
    }

    public ExamenClinique(Integer poids, Integer taille, Double sc, Float pas, Float pad, Float pas2, Float pad2, Boolean ac, String bruit, String anormale, Boolean souf, String preciseSouf, Boolean poul, String precisePoul, Boolean peripherique, Boolean varices, String fc, String rythme, String siege, Boolean reflux, Boolean siege2) {
        this.poids = poids;
        this.taille = taille;
        this.sc = sc;
        this.pas = pas;
        this.pad = pad;
        this.pas2 = pas2;
        this.pad2 = pad2;
        this.ac = ac;
        this.bruit = bruit;
        this.anormale = anormale;
        this.souf = souf;
        this.preciseSouf = preciseSouf;
        this.poul = poul;
        this.precisePoul = precisePoul;
        this.peripherique = peripherique;
        this.varices = varices;
        this.fc = fc;
        this.rythme = rythme;
        this.siege = siege;
        this.reflux = reflux;
        this.siege2 = siege2;
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

    public Float getPas() {
        return pas;
    }

    public void setPas(Float pas) {
        this.pas = pas;
    }

    public Float getPad() {
        return pad;
    }

    public void setPad(Float pad) {
        this.pad = pad;
    }

    public Float getPas2() {
        return pas2;
    }

    public void setPas2(Float pas2) {
        this.pas2 = pas2;
    }

    public Float getPad2() {
        return pad2;
    }

    public void setPad2(Float pad2) {
        this.pad2 = pad2;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public String getBruit() {
        return bruit;
    }

    public void setBruit(String bruit) {
        this.bruit = bruit;
    }

    public String getAnormale() {
        return anormale;
    }

    public void setAnormale(String anormale) {
        this.anormale = anormale;
    }

    public Boolean getSouf() {
        return souf;
    }

    public void setSouf(Boolean souf) {
        this.souf = souf;
    }

    public String getPreciseSouf() {
        return preciseSouf;
    }

    public void setPreciseSouf(String preciseSouf) {
        this.preciseSouf = preciseSouf;
    }

    public Boolean getPoul() {
        return poul;
    }

    public void setPoul(Boolean poul) {
        this.poul = poul;
    }

    public String getPrecisePoul() {
        return precisePoul;
    }

    public void setPrecisePoul(String precisePoul) {
        this.precisePoul = precisePoul;
    }

    public Boolean getPeripherique() {
        return peripherique;
    }

    public void setPeripherique(Boolean peripherique) {
        this.peripherique = peripherique;
    }

    public Boolean getVarices() {
        return varices;
    }

    public void setVarices(Boolean varices) {
        this.varices = varices;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getRythme() {
        return rythme;
    }

    public void setRythme(String rythme) {
        this.rythme = rythme;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public Boolean getReflux() {
        return reflux;
    }

    public void setReflux(Boolean reflux) {
        this.reflux = reflux;
    }

    public Boolean getSiege2() {
        return siege2;
    }

    public void setSiege2(Boolean siege2) {
        this.siege2 = siege2;
    }
}
