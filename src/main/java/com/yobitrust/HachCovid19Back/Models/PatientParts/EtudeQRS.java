package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class EtudeQRS {
    private Integer duree;
    private Boolean axeNormale;
    private Integer deviation;
    private Boolean ondeQ;
    private Integer scolow;
    private Boolean bbg;
    private Boolean bbd;
    private EtudeQRS() {
    }

    public EtudeQRS(Integer duree, Boolean axeNormale, Integer deviation, Boolean ondeQ, Integer scolow, Boolean bbg, Boolean bbd) {
        this.duree = duree;
        this.axeNormale = axeNormale;
        this.deviation = deviation;
        this.ondeQ = ondeQ;
        this.scolow = scolow;
        this.bbg = bbg;
        this.bbd = bbd;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Boolean getAxeNormale() {
        return axeNormale;
    }

    public void setAxeNormale(Boolean axeNormale) {
        this.axeNormale = axeNormale;
    }

    public Integer getDeviation() {
        return deviation;
    }

    public void setDeviation(Integer deviation) {
        this.deviation = deviation;
    }

    public Boolean getOndeQ() {
        return ondeQ;
    }

    public void setOndeQ(Boolean ondeQ) {
        this.ondeQ = ondeQ;
    }

    public Integer getScolow() {
        return scolow;
    }

    public void setScolow(Integer scolow) {
        this.scolow = scolow;
    }

    public Boolean getBbd() {
        return bbd;
    }

    public void setBbd(Boolean bbd) {
        this.bbd = bbd;
    }
}

