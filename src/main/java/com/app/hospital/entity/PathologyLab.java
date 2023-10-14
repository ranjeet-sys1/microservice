package com.app.hospital.entity;



import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="lab_test")
public class PathologyLab {
    @Id
    private String testId= UUID.randomUUID().toString();
    private String testName;
    private List<String> sample=new ArrayList<>();
    private Double price;
    private String pathologyLabDrName;
    private String referredByDoctor;
    @OneToMany
    @JoinColumn(name="test_id")
    private List<Patient> patient=new ArrayList<>();

    public PathologyLab() {
    }

    public PathologyLab(String testId, String testName, List<String> sample, Double price, String pathologyLabDrName, String referredByDoctor, List<Patient> patient) {
        this.testId = testId;
        this.testName = testName;
        this.sample = sample;
        this.price = price;
        this.pathologyLabDrName = pathologyLabDrName;
        this.referredByDoctor = referredByDoctor;
        this.patient = patient;
    }

    public String getTestId() {
        return testId;
    }

    public String getTestName() {
        return testName;
    }

    public List<String> getSample() {
        return sample;
    }

    public Double getPrice() {
        return price;
    }

    public String getPathologyLabDrName() {
        return pathologyLabDrName;
    }

    public String getReferredByDoctor() {
        return referredByDoctor;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setSample(List<String> sample) {
        this.sample = sample;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPathologyLabDrName(String pathologyLabDrName) {
        this.pathologyLabDrName = pathologyLabDrName;
    }

    public void setReferredByDoctor(String referredByDoctor) {
        this.referredByDoctor = referredByDoctor;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }
}
