package com.app.hospital.controller;

import com.app.hospital.entity.Doctor;
import com.app.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/hiring/doctor")
    public ResponseEntity<Doctor> hiringNewDoctor(@RequestBody Doctor doctor){
        Doctor savedDoctor = doctorService.hireNewDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.OK);
    }
}
