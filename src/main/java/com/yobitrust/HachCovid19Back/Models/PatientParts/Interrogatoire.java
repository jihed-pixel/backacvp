package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class Interrogatoire {
    private Boolean antecedentsFam;
    private Boolean pridiabete;
    private Boolean hta;
    private Boolean tabac;
    private Boolean douleureTho;
    private Boolean synope;
    private Boolean dyspnee;
    private Boolean palpitations;
    private Boolean antecedentCov;
    private Interrogatoire() {
    }

    public Interrogatoire(Boolean antecedentsFam, Boolean pridiabete, Boolean hta, Boolean tabac, Boolean douleureTho, Boolean synope, Boolean dyspnee, Boolean palpitations, Boolean antecedentCov1) {
        this.antecedentsFam = antecedentsFam;
        this.pridiabete = pridiabete;
        this.hta = hta;
        this.tabac = tabac;
        this.douleureTho = douleureTho;
        this.synope = synope;
        this.dyspnee = dyspnee;
        this.palpitations = palpitations;
        this.antecedentCov = antecedentCov1;
    }

    public Boolean getAntecedentsFam() {
        return antecedentsFam;
    }

    public void setAntecedentsFam(Boolean antecedentsFam) {
        this.antecedentsFam = antecedentsFam;
    }

    public Boolean getPridiabete() {
        return pridiabete;
    }

    public void setPridiabete(Boolean pridiabete) {
        this.pridiabete = pridiabete;
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

    public Boolean getAntecedentCov() {
        return antecedentCov;
    }

    public void setAntecedentCov(Boolean antecedentCov) {
        this.antecedentCov = antecedentCov;
    }
}
