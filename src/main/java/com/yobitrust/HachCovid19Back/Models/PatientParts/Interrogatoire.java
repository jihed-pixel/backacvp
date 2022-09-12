package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class Interrogatoire {
    private Boolean moreSub;
    private Boolean condFam;
    private String autreCond;
    private Boolean condio;
    private String autreCondio;
    private Boolean trouble;
    private String autreTrouble;
    private Boolean diabete;
    private Boolean hta;
    private Boolean tabac;
    private String autreTabac;
    private Boolean chicha;
    private String autreChicha;
    private Boolean alcole;
    private String autreAlcole;
    private Boolean douleureTho;
    private Boolean synope;
    private Boolean dyspnee;
    private Boolean palpitations;
    private String antecedentCov;
    private Boolean produit;
    private String autreproduit;

    private Boolean drogue;
    private String preciserDrogue;
    private String autreSigne;

    private Interrogatoire() {
    }

    public Interrogatoire(Boolean moreSub, Boolean condFam, String autreCond, Boolean condio, String autreCondio, Boolean trouble, String autreTrouble, Boolean diabete, Boolean hta, Boolean tabac, String autreTabac, Boolean chicha, String autreChicha, Boolean alcole, String autreAlcole, Boolean douleureTho, Boolean synope, Boolean dyspnee, Boolean palpitations, String antecedentCov, Boolean produit, String autreproduit, Boolean drogue, String preciserDrogue, String autreSigne) {
        this.moreSub = moreSub;
        this.condFam = condFam;
        this.autreCond = autreCond;
        this.condio = condio;
        this.autreCondio = autreCondio;
        this.trouble = trouble;
        this.autreTrouble = autreTrouble;
        this.diabete = diabete;
        this.hta = hta;
        this.tabac = tabac;
        this.autreTabac = autreTabac;
        this.chicha = chicha;
        this.autreChicha = autreChicha;
        this.alcole = alcole;
        this.autreAlcole = autreAlcole;
        this.douleureTho = douleureTho;
        this.synope = synope;
        this.dyspnee = dyspnee;
        this.palpitations = palpitations;
        this.antecedentCov = antecedentCov;
        this.produit = produit;
        this.autreproduit = autreproduit;
        this.drogue = drogue;
        this.preciserDrogue = preciserDrogue;
        this.autreSigne = autreSigne;
    }

    public Boolean getMoreSub() {
        return moreSub;
    }

    public void setMoreSub(Boolean moreSub) {
        this.moreSub = moreSub;
    }

    public Boolean getCondFam() {
        return condFam;
    }

    public void setCondFam(Boolean condFam) {
        this.condFam = condFam;
    }

    public String getAutreCond() {
        return autreCond;
    }

    public void setAutreCond(String autreCond) {
        this.autreCond = autreCond;
    }

    public Boolean getCondio() {
        return condio;
    }

    public void setCondio(Boolean condio) {
        this.condio = condio;
    }

    public String getAutreCondio() {
        return autreCondio;
    }

    public void setAutreCondio(String autreCondio) {
        this.autreCondio = autreCondio;
    }

    public Boolean getTrouble() {
        return trouble;
    }

    public void setTrouble(Boolean trouble) {
        this.trouble = trouble;
    }

    public String getAutreTrouble() {
        return autreTrouble;
    }

    public void setAutreTrouble(String autreTrouble) {
        this.autreTrouble = autreTrouble;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public Boolean getHta() {
        return hta;
    }

    public void setHta(Boolean hta) {
        this.hta = hta;
    }

    public Boolean getTabac() {
        return tabac;
    }

    public void setTabac(Boolean tabac) {
        this.tabac = tabac;
    }

    public String getAutreTabac() {
        return autreTabac;
    }

    public void setAutreTabac(String autreTabac) {
        this.autreTabac = autreTabac;
    }

    public Boolean getChicha() {
        return chicha;
    }

    public void setChicha(Boolean chicha) {
        this.chicha = chicha;
    }

    public String getAutreChicha() {
        return autreChicha;
    }

    public void setAutreChicha(String autreChicha) {
        this.autreChicha = autreChicha;
    }

    public Boolean getAlcole() {
        return alcole;
    }

    public void setAlcole(Boolean alcole) {
        this.alcole = alcole;
    }

    public String getAutreAlcole() {
        return autreAlcole;
    }

    public void setAutreAlcole(String autreAlcole) {
        this.autreAlcole = autreAlcole;
    }

    public Boolean getDouleureTho() {
        return douleureTho;
    }

    public void setDouleureTho(Boolean douleureTho) {
        this.douleureTho = douleureTho;
    }

    public Boolean getSynope() {
        return synope;
    }

    public void setSynope(Boolean synope) {
        this.synope = synope;
    }

    public Boolean getDyspnee() {
        return dyspnee;
    }

    public void setDyspnee(Boolean dyspnee) {
        this.dyspnee = dyspnee;
    }

    public Boolean getPalpitations() {
        return palpitations;
    }

    public void setPalpitations(Boolean palpitations) {
        this.palpitations = palpitations;
    }

    public String getAntecedentCov() {
        return antecedentCov;
    }

    public void setAntecedentCov(String antecedentCov) {
        this.antecedentCov = antecedentCov;
    }

    public Boolean getProduit() {
        return produit;
    }

    public void setProduit(Boolean produit) {
        this.produit = produit;
    }

    public String getAutreproduit() {
        return autreproduit;
    }

    public void setAutreproduit(String autreproduit) {
        this.autreproduit = autreproduit;
    }

    public Boolean getDrogue() {
        return drogue;
    }

    public void setDrogue(Boolean drogue) {
        this.drogue = drogue;
    }

    public String getPreciserDrogue() {
        return preciserDrogue;
    }

    public void setPreciserDrogue(String preciserDrogue) {
        this.preciserDrogue = preciserDrogue;
    }

    public String getAutreSigne() {
        return autreSigne;
    }

    public void setAutreSigne(String autreSigne) {
        this.autreSigne = autreSigne;
    }
}
