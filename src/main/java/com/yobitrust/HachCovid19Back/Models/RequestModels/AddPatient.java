package com.yobitrust.HachCovid19Back.Models.RequestModels;


import java.util.Date;

public class AddPatient {

    private String cin;
    private String cinD;
    private String ville;
    private Date age;
    private String sexe;
    private Date dateD;
    private String sport;
    private Integer sportp;
    private Date date;
    private Integer nh;

    public AddPatient() {
    }

    public AddPatient(String cin, String cinD, String ville, Date age, String sexe, Date dateD, String sport, Integer sportp, Date date, Integer nh) {
        this.cin = cin;
        this.cinD = cinD;
        this.ville = ville;
        this.age = age;
        this.sexe = sexe;
        this.dateD = dateD;
        this.sport = sport;
        this.sportp = sportp;
        this.date = date;
        this.nh = nh;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCinD() {
        return cinD;
    }

    public void setCinD(String cinD) {
        this.cinD = cinD;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Integer getSportp() {
        return sportp;
    }

    public void setSportp(Integer sportp) {
        this.sportp = sportp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNh() {
        return nh;
    }

    public void setNh(Integer nh) {
        this.nh = nh;
    }
}
