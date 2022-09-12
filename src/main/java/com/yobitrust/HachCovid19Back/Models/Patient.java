package com.yobitrust.HachCovid19Back.Models;

import com.yobitrust.HachCovid19Back.Models.PatientParts.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Fiche.Fiche;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Segment.Segment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class Patient {
    @Id
    private String cin ;
    private String cinD ;
    private GeneralInformation generalInformation;
    private Interrogatoire  interrogatoire;
    private ExamenClinique  examenClinique;
    private EtudeECG etudeECG;
    private EtudeQRS etudeQRS;
    private EtudeOndeT etudeOndeT;
    private HashMap<String, Segment> segment;
    private AspectSegment aspectSegment;
    private Ventricule ventricule;
    private FicheIRM ficheIRM;
    private FicheEffort ficheEffort;
    private Cercle1 cercle1;
    private Cercle2 cercle2;
    private Cercle3 cercle3;
    private Cercle4 cercle4;
    private Autre autre;
    public Patient() {

        this.segment=new HashMap<String, Segment>();
    }

    public Patient(String cin, String cinD,GeneralInformation generalInformation, Interrogatoire interrogatoire, FicheEffort ficheEffort, ExamenClinique examenClinique, EtudeECG etudeECG, EtudeQRS etudeQRS, EtudeOndeT etudeOndeT, HashMap<String, Segment> segment, AspectSegment aspectSegment, Ventricule ventricule,FicheIRM ficheIRM, Cercle1 cercle1, Cercle2 cercle2, Cercle3 cercle3, Cercle4 cercle4, Autre autre) {
        this.cin = cin;
        this.cinD = cinD;
        this.generalInformation = generalInformation;
        this.interrogatoire = interrogatoire;
        this.examenClinique = examenClinique;
        this.etudeECG = etudeECG;
        this.etudeQRS = etudeQRS;
        this.etudeOndeT = etudeOndeT;
        this.segment = segment;
        this.aspectSegment = aspectSegment;
        this.ventricule = ventricule;
        this.ficheIRM = ficheIRM;
        this.ficheEffort = ficheEffort;
        this.cercle1 = cercle1;
        this.cercle2 = cercle2;
        this.cercle3 = cercle3;
        this.cercle4 = cercle4;
        this.ficheIRM = ficheIRM;
        this.autre = autre;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }



    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation; }



    public Interrogatoire getInterrogatoire() {
        return interrogatoire;
    }

    public void setInterrogatoire(Interrogatoire interrogatoire) {
        this.interrogatoire = interrogatoire;
    }

    public ExamenClinique getExamenClinique() {
        return examenClinique;
    }

    public void setExamenClinique(ExamenClinique examenClinique) {
        this.examenClinique = examenClinique;
    }

    public EtudeECG getEtudeECG() {
        return etudeECG;
    }

    public void setEtudeECG(EtudeECG etudeECG) {
        this.etudeECG = etudeECG;
    }

    public EtudeQRS getEtudeQRS() {
        return etudeQRS;
    }

    public void setEtudeQRS(EtudeQRS etudeQRS) {
        this.etudeQRS = etudeQRS;
    }

    public EtudeOndeT getEtudeOndeT() {
        return etudeOndeT;
    }

    public void setEtudeOndeT(EtudeOndeT etudeOndeT) {
        this.etudeOndeT = etudeOndeT;
    }

    public HashMap<String, Segment> getSegment() {
        return segment;
    }

    public void setSegment(HashMap<String, Segment> segment) {
        this.segment = segment;
    }

    public AspectSegment getAspectSegment() {
        return aspectSegment;
    }

    public void setAspectSegment(AspectSegment aspectSegment) {
        this.aspectSegment = aspectSegment;
    }

    public Ventricule getVentricule() {
        return ventricule;
    }

    public void setVentricule(Ventricule ventricule) {
        this.ventricule = ventricule;
    }

    public FicheIRM getFicheIRM() {
        return ficheIRM;
    }

    public void setFicheIRM(FicheIRM ficheIRM) {
        this.ficheIRM = ficheIRM;
    }

    public Cercle1 getCercle1() {
        return cercle1;
    }

    public void setCercle1(Cercle1 cercle1) {
        this.cercle1 = cercle1;
    }

    public Cercle2 getCercle2() {
        return cercle2;
    }

    public void setCercle2(Cercle2 cercle2) {
        this.cercle2 = cercle2;
    }

    public Cercle3 getCercle3() {
        return cercle3;
    }

    public void setCercle3(Cercle3 cercle3) {
        this.cercle3 = cercle3;
    }

    public Cercle4 getCercle4() {
        return cercle4;
    }

    public void setCercle4(Cercle4 cercle4) {
        this.cercle4 = cercle4;
    }


    public Autre getAutre() {
        return autre;
    }

    public void setAutre(Autre autre) {
        this.autre = autre;
    }

    public FicheEffort getFicheEffort() {
        return ficheEffort;
    }

    public void setFicheEffort(FicheEffort ficheEffort) {
        this.ficheEffort = ficheEffort;
    }

    public String getCinD() {
        return cinD;
    }

    public void setCinD(String cinD) {
        this.cinD = cinD;
    }
}
