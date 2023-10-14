package com.app.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="doctor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    private String doctorId= UUID.randomUUID().toString();
    private String docName;
    private String qualification;
    private Date   dateOfJoining;
    private Double experience;
    private String availability;
    private String specialization;
    private Date dateOfBirth;

}
