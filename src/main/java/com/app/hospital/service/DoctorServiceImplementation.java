package com.app.hospital.service;

import com.app.hospital.entity.Doctor;
import com.app.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;
@Service
public class DoctorServiceImplementation implements DoctorService{
    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public Doctor hireNewDoctor(Doctor doctor) {
        /*doctor.setDoctorId(UUID.randomUUID().toString());
        doctor.setDocName("Sumit Rai");
        doctor.setExperience(10.00);
        doctor.setDateOfBirth(new Date(1995-01-1995));
        doctor.setAvailability("10AM-6PM");
        doctor.setQualification("MD,M.B.B.S");
        doctor.setSpecialization("General physician");
        doctor.setDateOfJoining(new Date(2020-1-1));*/
        Doctor savedDoctor = doctorRepository.save(doctor);
        return savedDoctor;
    }
}
