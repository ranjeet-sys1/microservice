package com.app.hospital.repository;

import com.app.hospital.entity.AdmittedPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmittedPatientRepository extends JpaRepository<AdmittedPatient,String> {
}
