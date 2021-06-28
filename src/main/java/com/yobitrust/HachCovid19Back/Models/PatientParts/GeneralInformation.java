package com.yobitrust.HachCovid19Back.Models.PatientParts;
import java.util.Date;
public class GeneralInformation {
    private String nom;
    private String prenom;
    private Integer age;
    private String sexe;
    private Integer dateDebut;
    private Date date;
    private Integer nh;


    public GeneralInformation() {
    }

    public GeneralInformation(String nom, String prenom, Integer age, String sexe, Integer dateDebut, Date date, Integer nh) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.dateDebut = dateDebut;
        this.date = date;
        this.nh = nh;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Integer dateDebut) {
        this.dateDebut = dateDebut;
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
