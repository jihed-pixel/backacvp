package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class EtudeECG {
    private  String d21;
    private  String avr1;
    private Boolean  rythme;
    private Integer  fc;
    private Integer duree;
    private Double  amplitude;
    private  String d1;
    private  String d2;
    private  String  d3;
    private  String avr;
    private  String avl;
    private String  avf;
    private String  v1;
    private String  v2;
    private  String v3;
    private  String v4;
    private  String v5;
    private  String v6;
    private  Integer intervallPR;
    private EtudeECG() {
    }

    public EtudeECG(String d21, String avr1, Boolean rythme , Integer fc, Integer duree, Double amplitude, String d1, String d2, String d3, String avr, String avl, String avf, String v1, String v2, String v3, String v4, String v5, String v6, Integer intervallPR) {
        this.d21 = d21;
        this.avr1 = avr1;
        this.rythme = rythme;
        this.fc = fc;
        this.duree = duree;
        this.amplitude = amplitude;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.avr = avr;
        this.avl = avl;
        this.avf = avf;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
        this.intervallPR = intervallPR;
    }

    public String getD21() {
        return d21;
    }

    public void setD21(String d21) {
        this.d21 = d21;
    }

    public String getAvr1() {
        return avr1;
    }

    public void setAvr1(String avr1) {
        this.avr1 = avr1;
    }

    public Boolean getRythme() {
        return rythme;
    }

    public void setRythme(Boolean rythme) {
        this.rythme = rythme;
    }



    public Integer getFc() {
        return fc;
    }

    public void setFc(Integer fc) {
        this.fc = fc;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(Double amplitude) {
        this.amplitude = amplitude;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getAvr() {
        return avr;
    }

    public void setAvr(String avr) {
        this.avr = avr;
    }

    public String getAvl() {
        return avl;
    }

    public void setAvl(String avl) {
        this.avl = avl;
    }

    public String getAvf() {
        return avf;
    }

    public void setAvf(String avf) {
        this.avf = avf;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public String getV4() {
        return v4;
    }

    public void setV4(String v4) {
        this.v4 = v4;
    }

    public String getV5() {
        return v5;
    }

    public void setV5(String v5) {
        this.v5 = v5;
    }

    public String getV6() {
        return v6;
    }

    public void setV6(String v6) {
        this.v6 = v6;
    }

    public Integer getIntervallPR() {
        return intervallPR;
    }

    public void setIntervallPR(Integer intervallPR) {
        this.intervallPR = intervallPR;
    }
}
