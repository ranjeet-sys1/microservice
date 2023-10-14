package com.app.hospital.service;

import com.app.hospital.entity.Patient;
import com.app.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImplementation implements PatientService{
    @Autowired
    PatientRepository patientRepository;
    @Override
    public Patient registerNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(String patientID) {
        Optional<Patient> byId = patientRepository.findById(patientID);
        Patient patient=new Patient();
        if(byId.isPresent()){
             patient = byId.get();
        }

        return patient;
    }
}
