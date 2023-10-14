package com.app.hospital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class PatientExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handlePatientNotFoundException(PatientNotFoundException patientNotFoundException){
        PatientException patientException=new PatientException(
                patientNotFoundException.getMessage(),
                patientNotFoundException.getCause(),
                HttpStatus.NOT_FOUND);
        return new ResponseEntity<Object>(patientException,HttpStatus.NOT_FOUND);

    }
}
