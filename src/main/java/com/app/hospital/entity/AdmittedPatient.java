package com.app.hospital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name="admitted_patient")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdmittedPatient {
    @Id
    private String admitId= UUID.randomUUID().toString();
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="wing_no")
   private BuildingName buildingName;
   private Date admittedDateTime;
   private Date appointmentDate;
   private List<String> disease;
   private Date dischargeDate;
   @OneToMany
   @JoinColumn(name="admit_id")
   private List<PathologyLab> pathologyLabTest=new ArrayList<>();


}
