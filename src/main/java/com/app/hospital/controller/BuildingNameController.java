package com.app.hospital.controller;

import com.app.hospital.entity.BuildingName;
import com.app.hospital.service.infrastructure.BuildingNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingNameController {
    @Autowired
    private BuildingNameService buildingNameService;

    @PostMapping("create/building")
    public ResponseEntity<BuildingName> createBuilding(@RequestBody BuildingName buildingName){
        return new ResponseEntity<>(buildingNameService.createBuilding(buildingName), HttpStatus.OK);
    }
}
