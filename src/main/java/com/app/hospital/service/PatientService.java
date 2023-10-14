package com.app.hospital.service;

import com.app.hospital.entity.Patient;

public interface PatientService {
    Patient registerNewPatient(Patient patient);
    Patient getPatientById(String patientID);
}
