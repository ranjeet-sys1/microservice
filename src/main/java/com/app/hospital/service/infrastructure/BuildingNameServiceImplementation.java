package com.app.hospital.service.infrastructure;

import com.app.hospital.entity.BuildingName;
import com.app.hospital.repository.infrastructure.BuildingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingNameServiceImplementation implements BuildingNameService {
    @Autowired
    private BuildingDetailsRepository buildingDetailsRepository;
    @Override
    public BuildingName createBuilding(BuildingName buildingName) {
        return buildingDetailsRepository.save(buildingName);
    }
}
