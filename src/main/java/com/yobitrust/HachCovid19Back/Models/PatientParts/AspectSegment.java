package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class AspectSegment {
    private Boolean asp;
    private String type;
    private String qt;
    private String qtc;
    private AspectSegment(){}

    public AspectSegment(Boolean asp, String type, String qt, String qtc) {
        this.asp = asp;
        this.type = type;
        this.qt = qt;
        this.qtc = qtc;
    }

    public Boolean getAsp() {
        return asp;
    }

    public void setAsp(Boolean asp) {
        this.asp = asp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt;
    }

    public String getQtc() {
        return qtc;
    }

    public void setQtc(String qtc) {
        this.qtc = qtc;
    }
}
