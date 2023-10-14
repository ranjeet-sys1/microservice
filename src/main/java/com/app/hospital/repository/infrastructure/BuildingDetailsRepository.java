package com.app.hospital.repository.infrastructure;

import com.app.hospital.entity.BuildingName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingDetailsRepository extends JpaRepository<BuildingName,Integer> {
}
