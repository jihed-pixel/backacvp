package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class EtudeQRS {
    private Integer duree;
    private Boolean axeNormale;
    private Integer deviation;
    private Boolean ondeQ;
    private String siOui;
    private Integer scolow;
    private boolean surchrge;
    private Boolean bbg;
    private Boolean bbd;
    private String sioui;
    private String sioui2;
    private String sioui3;
    private EtudeQRS() {
    }

    public EtudeQRS(Integer duree, Boolean axeNormale, Integer deviation, Boolean ondeQ, String siOui, Integer scolow, boolean surchrge, Boolean bbg, Boolean bbd, String sioui, String sioui2, String sioui3) {
        this.duree = duree;
        this.axeNormale = axeNormale;
        this.deviation = deviation;
        this.ondeQ = ondeQ;
        this.siOui = siOui;
        this.scolow = scolow;
        this.surchrge = surchrge;
        this.bbg = bbg;
        this.bbd = bbd;
        this.sioui = sioui;
        this.sioui2 = sioui2;
        this.sioui3 = sioui3;
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

    public String getSiOui() {
        return siOui;
    }

    public void setSiOui(String siOui) {
        this.siOui = siOui;
    }

    public Integer getScolow() {
        return scolow;
    }

    public void setScolow(Integer scolow) {
        this.scolow = scolow;
    }

    public boolean isSurchrge() {
        return surchrge;
    }

    public void setSurchrge(boolean surchrge) {
        this.surchrge = surchrge;
    }

    public Boolean getBbg() {
        return bbg;
    }

    public void setBbg(Boolean bbg) {
        this.bbg = bbg;
    }

    public Boolean getBbd() {
        return bbd;
    }

    public void setBbd(Boolean bbd) {
        this.bbd = bbd;
    }

    public String getSioui() {
        return sioui;
    }

    public void setSioui(String sioui) {
        this.sioui = sioui;
    }

    public String getSioui2() {
        return sioui2;
    }

    public void setSioui2(String sioui2) {
        this.sioui2 = sioui2;
    }

    public String getSioui3() {
        return sioui3;
    }

    public void setSioui3(String sioui3) {
        this.sioui3 = sioui3;
    }
}

