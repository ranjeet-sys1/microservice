package com.app.hospital.controller;

import com.app.hospital.entity.Patient;
import com.app.hospital.response.ResponseHandler;
import com.app.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/register/patient")
    public ResponseEntity<Patient> registerNewPatient(@RequestBody Patient patient) {
        Patient registeredPatient = patientService.registerNewPatient(patient);
        return new ResponseEntity<>(registeredPatient, HttpStatus.OK);
    }

    @GetMapping("/get/patient/{patientId}")
    public ResponseEntity<Object> getPatientById(@PathVariable ("patientId") String patientId){
        Patient patientById = patientService.getPatientById(patientId);
        ResponseEntity<Object> objectResponseEntity = ResponseHandler.responseHandler("patient details are given as below: ",
                HttpStatus.OK, patientById);
        //return new ResponseEntity<>(patientById,HttpStatus.OK);
        return objectResponseEntity;
    }
}
