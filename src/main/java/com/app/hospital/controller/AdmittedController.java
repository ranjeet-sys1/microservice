package com.app.hospital.controller;

import com.app.hospital.entity.AdmittedPatient;
import com.app.hospital.service.AdmittedPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmittedController {
    @Autowired
    private AdmittedPatientService admittedPatientService;

    @PostMapping("/admit/patient")
    public ResponseEntity<AdmittedPatient> admitPatient(@RequestBody AdmittedPatient admittedPatient){
        AdmittedPatient admittedPatient1 = admittedPatientService.admitPatient(admittedPatient);
        return new ResponseEntity<>(admittedPatient1, HttpStatus.OK);
    }
}
