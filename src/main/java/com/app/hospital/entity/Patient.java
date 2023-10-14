package com.app.hospital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@Entity
@Table(name="patient")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    private String patientId= UUID.randomUUID().toString();
    private String patientName;
    private String address;
    private Date dateOfBirth;
    private String govIdNumber= UUID.randomUUID().toString();
    private List<String> issues=new ArrayList<>();
    private Date registrationDate;
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor assignedDoctor;
    private String contactNo;
}
