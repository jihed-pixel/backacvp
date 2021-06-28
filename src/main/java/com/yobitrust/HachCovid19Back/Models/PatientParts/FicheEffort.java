package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class FicheEffort {
    private  Integer velo;
    private  Integer type;
    private  Integer charge;
    private  Integer ta;
    private  Integer tap;
    private  Integer fc;
    private  Boolean trouCon;
    private  Boolean trouRep;
    private  Boolean trouRyt;

private FicheEffort(){}

    public Integer getVelo() {
        return velo;
    }

    public void setVelo(Integer velo) {
        this.velo = velo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Integer getTa() {
        return ta;
    }

    public void setTa(Integer ta) {
        this.ta = ta;
    }

    public Integer getTap() {
        return tap;
    }

    public void setTap(Integer tap) {
        this.tap = tap;
    }

    public Integer getFc() {
        return fc;
    }

    public void setFc(Integer fc) {
        this.fc = fc;
    }

    public Boolean getTrouCon() {
        return trouCon;
    }

    public void setTrouCon(Boolean trouCon) {
        this.trouCon = trouCon;
    }

    public Boolean getTrouRep() {
        return trouRep;
    }

    public void setTrouRep(Boolean trouRep) {
        this.trouRep = trouRep;
    }

    public Boolean getTrouRyt() {
        return trouRyt;
    }

    public void setTrouRyt(Boolean trouRyt) {
        this.trouRyt = trouRyt;
    }

    public FicheEffort(Integer velo, Integer type, Integer charge, Integer ta, Integer tap, Integer fc, Boolean trouCon, Boolean trouRep, Boolean trouRyt) {
        this.velo = velo;
        this.type = type;
        this.charge = charge;
        this.ta = ta;
        this.tap = tap;
        this.fc = fc;
        this.trouCon = trouCon;
        this.trouRep = trouRep;
        this.trouRyt = trouRyt;

    }
}
