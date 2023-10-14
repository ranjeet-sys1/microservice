package com.app.hospital.service;


import com.app.hospital.entity.AdmittedPatient;
import com.app.hospital.repository.AdmittedPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmittedPatientServiceImpl implements AdmittedPatientService{
    @Autowired
    AdmittedPatientRepository admittedPatientRepository;

    @Override
    public AdmittedPatient admitPatient(AdmittedPatient admittedPatient) {
        return admittedPatientRepository.save(admittedPatient);
    }
}
