package com.yobitrust.HachCovid19Back.Models.PatientParts.Segment;

public class Sus_decalage extends Segment{
    private  Boolean d1;
    private  Boolean d2;
    private  Boolean  d3;
    private  Boolean avr;
    private  Boolean avl;
    private Boolean  avf;
    private Boolean  v1;
    private Boolean  v2;
    private  Boolean v3;
    private  Boolean v4;
    private  Boolean v5;
    private  Boolean v6;
    private Sus_decalage() {
    }

    public Sus_decalage(Boolean d1, Boolean d2, Boolean d3, Boolean avr, Boolean avl, Boolean avf, Boolean v1, Boolean v2, Boolean v3, Boolean v4, Boolean v5, Boolean v6) {
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
    }

    public Boolean getD1() {
        return d1;
    }

    public void setD1(Boolean d1) {
        this.d1 = d1;
    }

    public Boolean getD2() {
        return d2;
    }

    public void setD2(Boolean d2) {
        this.d2 = d2;
    }

    public Boolean getD3() {
        return d3;
    }

    public void setD3(Boolean d3) {
        this.d3 = d3;
    }

    public Boolean getAvr() {
        return avr;
    }

    public void setAvr(Boolean avr) {
        this.avr = avr;
    }

    public Boolean getAvl() {
        return avl;
    }

    public void setAvl(Boolean avl) {
        this.avl = avl;
    }

    public Boolean getAvf() {
        return avf;
    }

    public void setAvf(Boolean avf) {
        this.avf = avf;
    }

    public Boolean getV1() {
        return v1;
    }

    public void setV1(Boolean v1) {
        this.v1 = v1;
    }

    public Boolean getV2() {
        return v2;
    }

    public void setV2(Boolean v2) {
        this.v2 = v2;
    }

    public Boolean getV3() {
        return v3;
    }

    public void setV3(Boolean v3) {
        this.v3 = v3;
    }

    public Boolean getV4() {
        return v4;
    }

    public void setV4(Boolean v4) {
        this.v4 = v4;
    }

    public Boolean getV5() {
        return v5;
    }

    public void setV5(Boolean v5) {
        this.v5 = v5;
    }

    public Boolean getV6() {
        return v6;
    }

    public void setV6(Boolean v6) {
        this.v6 = v6;
    }
}
