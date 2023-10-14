package com.app.hospital.controller;

import com.app.hospital.entity.PathologyLab;
import com.app.hospital.service.PathologyLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PathologyLabController {
    @Autowired
    PathologyLabService pathologyLabService;

    @PostMapping("/pathology/test")
    public ResponseEntity createPathologyTest(@RequestBody PathologyLab pathologyLab){
        PathologyLab test = pathologyLabService.createTest(pathologyLab);
        return new ResponseEntity(test, HttpStatus.OK);
    }
    @GetMapping("/pathology/test/{testId}")
    public ResponseEntity getPatientTestByTestId(@PathVariable("testId") String testId){
        PathologyLab patientTestByTestId = pathologyLabService.getPatientTestByTestId(testId);
        return new ResponseEntity<>(patientTestByTestId,HttpStatus.OK);
    }
}
