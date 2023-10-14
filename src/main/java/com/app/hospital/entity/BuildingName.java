package com.app.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="building")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BuildingName {
    @Id
    @GeneratedValue
    private Integer wingNo;
    private String  buildingName;
    private Integer admittedFloor;
    private Integer roomNo;
    private Integer bedNo;
}
