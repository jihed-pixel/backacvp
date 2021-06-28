package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class AspectSegment {
    private Boolean asp;
    private String intervalle;
    private AspectSegment(){}

    public AspectSegment(Boolean asp, String intervalle) {
        this.asp = asp;
        this.intervalle = intervalle;
    }

    public Boolean getAsp() {
        return asp;
    }

    public void setAsp(Boolean asp) {
        this.asp = asp;
    }

    public String getIntervalle() {
        return intervalle;
    }

    public void setIntervalle(String intervalle) {
        this.intervalle = intervalle;
    }
}
