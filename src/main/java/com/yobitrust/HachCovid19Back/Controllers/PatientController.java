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

    @CrossOrigin(origins ="*" )
    @PostMapping("/add-infos-generales/{cin}")
    public ResponseEntity addInfosGenerales(@RequestBody GeneralInformation generalInformation ,@PathVariable String cin){
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setGeneralInformation(generalInformation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody AddPatient model) {

        Patient patient =patientRepository.findByCin(model.getCin());
        if (patient != null)
            return ResponseEntity.ok("Cin or/and matricule already existed");
        Patient newPatient = new Patient();
        newPatient.setCin(model.getCin());
        newPatient.setCinD(model.getCinD());
        ModelMapper mapper= new ModelMapper();
        GeneralInformation generalInformation = mapper.map(model,GeneralInformation.class);
        newPatient.setGeneralInformation(generalInformation);
        patientRepository.save(newPatient);
        return ResponseEntity.ok(newPatient);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/search1/{cin}/{cinD}")
    public ResponseEntity searchPatient(@PathVariable String cin,@PathVariable String cinD){
        Patient patient=patientRepository.findByCinAndCinD(cin,cinD);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @GetMapping("/search/{cin}")
    public ResponseEntity searchPatient(@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/interrogatoire/{cin}")
    public ResponseEntity interrogatoire(@RequestBody Interrogatoire interrogatoire,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setInterrogatoire(interrogatoire);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/examen-clinque/{cin}")
    public ResponseEntity examenClinique(@RequestBody ExamenClinique examenClinique,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setExamenClinique(examenClinique);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/etude-ecg/{cin}")
    public ResponseEntity etudeECG(@RequestBody EtudeECG etudeECG,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeECG(etudeECG);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/etude-qrs/{cin}")
    public ResponseEntity etudeQRS(@RequestBody EtudeQRS etudeQRS,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeQRS(etudeQRS);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/etude-ondet/{cin}")
    public ResponseEntity etudeQRS(@RequestBody EtudeOndeT etudeOndeT,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setEtudeOndeT(etudeOndeT);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/segment-st/{cin}")
    public ResponseEntity segment(@RequestBody SegmentSt segmentSt,@PathVariable String cin) {
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
    @CrossOrigin(origins ="*" )
    @PostMapping("/aspect-segment/{cin}")
    public ResponseEntity aspectSegment(@RequestBody AspectSegment aspectSegment,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setAspectSegment(aspectSegment);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/ventricule/{cin}")
    public ResponseEntity ventricule(@RequestBody Ventricule ventricule,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setVentricule(ventricule);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/ficheIRM/{cin}")
    public ResponseEntity ficheIRM(@RequestBody FicheIRM ficheIRM,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setFicheIRM(ficheIRM);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/cercle1/{cin}")
    public ResponseEntity cercle1(@RequestBody Cercle1 cercle1,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle1(cercle1);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/cercle2/{cin}")
    public ResponseEntity cercle2(@RequestBody Cercle2 cercle2,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle2(cercle2);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/cercle3/{cin}")
    public ResponseEntity cercle3(@RequestBody Cercle3 cercle3,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle3(cercle3);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/cercle4/{cin}")
    public ResponseEntity cercle4(@RequestBody Cercle4 cercle4,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setCercle4(cercle4);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/ficheEffort/{cin}")
    public ResponseEntity ficheEffort(@RequestBody FicheEffort ficheEffort,@PathVariable String cin) {
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setFicheEffort(ficheEffort);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="*" )
    @PostMapping("/autre/{cin}")
    public ResponseEntity autre(@RequestBody Autre autre,@PathVariable String cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");

        else patient.setAutre(autre);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    }





