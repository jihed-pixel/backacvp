package com.yobitrust.HachCovid19Back.Controllers;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Fiche.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Segment.*;
import com.yobitrust.HachCovid19Back.Models.RequestModels.*;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/add-infos-generales/{cin}")
    public ResponseEntity addInfosGenerales(@RequestBody GeneralInformation generalInformation ,@PathVariable Integer cin){
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setGeneralInformation(generalInformation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody AddPatient model) {

        Patient patient =patientRepository.findByCin(model.getCin());
        if (patient != null)
            return ResponseEntity.ok("Cin or/and matricule already existed");
        Patient newPatient = new Patient();
        newPatient.setCin(model.getCin());
        ModelMapper mapper= new ModelMapper();
        GeneralInformation generalInformation = mapper.map(model,GeneralInformation.class);
        newPatient.setGeneralInformation(generalInformation);
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @GetMapping("/search/{cin}")
    public ResponseEntity searchPatient(@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/interrogatoire/{cin}")
    public ResponseEntity interrogatoire(@RequestBody Interrogatoire interrogatoire,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setInterrogatoire(interrogatoire);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/examen-clinque/{cin}")
    public ResponseEntity examenClinique(@RequestBody ExamenClinique examenClinique,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setExamenClinique(examenClinique);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/etude-ecg/{cin}")
    public ResponseEntity etudeECG(@RequestBody EtudeECG etudeECG,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeECG(etudeECG);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/etude-qrs/{cin}")
    public ResponseEntity etudeQRS(@RequestBody EtudeQRS etudeQRS,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeQRS(etudeQRS);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/etude-ondet/{cin}")
    public ResponseEntity etudeQRS(@RequestBody EtudeOndeT etudeOndeT,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeOndeT(etudeOndeT);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/segment-st/{cin}")
    public ResponseEntity segment(@RequestBody SegmentSt segmentSt,@PathVariable Integer cin) {
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        ModelMapper mapper= new ModelMapper();
        HashMap<String, Segment> types =patient.getSegment();
        if(segmentSt.getType().equals("Iso_electrique")){
            Iso_electrique iso_electrique = mapper.map(segmentSt, Iso_electrique.class);
            types.put("iso_electrique",iso_electrique);
            patient.setSegment(types);
        }
        else if(segmentSt.getType().equals("Repolarisation_precoce")){
            Repolarisation_precoce repolarisation_precoce = mapper.map(segmentSt, Repolarisation_precoce.class);
            types.put("repolarisation_precoce",repolarisation_precoce);
            patient.setSegment(types);
        }
        else if(segmentSt.getType().equals("Sous_decalage")){
            Sous_decalage sous_decalage = mapper.map(segmentSt, Sous_decalage.class);
            types.put("sous_decalage",sous_decalage);
            patient.setSegment(types);
        }
        else if(segmentSt.getType().equals("Sus_decalage")){
            Sus_decalage sus_decalage = mapper.map(segmentSt, Sus_decalage.class);
            types.put("sus_decalage",sus_decalage);
            patient.setSegment(types);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/aspect-segment/{cin}")
    public ResponseEntity aspectSegment(@RequestBody AspectSegment aspectSegment,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setAspectSegment(aspectSegment);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/ventricule/{cin}")
    public ResponseEntity ventricule(@RequestBody Ventricule ventricule,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setVentricule(ventricule);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/ficheIRM/{cin}")
    public ResponseEntity ficheIRM(@RequestBody FicheIRM ficheIRM,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setFicheIRM(ficheIRM);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/cercle1/{cin}")
    public ResponseEntity cercle1(@RequestBody Cercle1 cercle1,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle1(cercle1);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @PostMapping("/cercle2/{cin}")
    public ResponseEntity cercle2(@RequestBody Cercle2 cercle2,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle2(cercle2);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @PostMapping("/cercle3/{cin}")
    public ResponseEntity cercle3(@RequestBody Cercle3 cercle3,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle3(cercle3);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @PostMapping("/cercle4/{cin}")
    public ResponseEntity cercle4(@RequestBody Cercle4 cercle4,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle4(cercle4);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="http://localhost:3000" )
    @PostMapping("/ficheEffort/{cin}")
    public ResponseEntity ficheEffort(@RequestBody FicheEffort ficheEffort,@PathVariable Integer cin) {
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        ModelMapper mapper= new ModelMapper();
        HashMap<String, Fiche> types =patient.getFiche();
        if(ficheEffort.getType().equals("5ème  Palier")){
            Cinquieme cinquieme = mapper.map(ficheEffort, Cinquieme.class);
            types.put("cinquieme",cinquieme);
            patient.setFiche(types);
        }
        else if(ficheEffort.getType().equals("2ème Palier")){
            Deuxieme deuxieme = mapper.map(ficheEffort, Deuxieme.class);
            types.put("deuxieme",deuxieme);
            patient.setFiche(types);
        }
        else if(ficheEffort.getType().equals("1er Palier")){
            Premier premier = mapper.map(ficheEffort, Premier.class);
            types.put("premier",premier);
            patient.setFiche(types);
        }
        else if(ficheEffort.getType().equals("4ème Palier")){
            Quatrieme quatrieme = mapper.map(ficheEffort, Quatrieme.class);
            types.put("quatrieme",quatrieme);
            patient.setFiche(types);
        }
        else if(ficheEffort.getType().equals("Récupération")){
            Recuperation recuperation = mapper.map(ficheEffort, Recuperation.class);
            types.put("recuperation",recuperation);
            patient.setFiche(types);
        }
        else if(ficheEffort.getType().equals("3ème Palier")){
            Troisieme troisieme = mapper.map(ficheEffort, Troisieme.class);
            types.put("troisieme",troisieme);
            patient.setFiche(types);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @PostMapping("/autre/{cin}")
    public ResponseEntity autre(@RequestBody Autre autre,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setAutre(autre);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    }





