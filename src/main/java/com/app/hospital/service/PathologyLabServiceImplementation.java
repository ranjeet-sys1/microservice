package com.app.hospital.service;

import com.app.hospital.entity.PathologyLab;
import com.app.hospital.repository.PathologyLabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PathologyLabServiceImplementation implements PathologyLabService{
    @Autowired
    PathologyLabRepository pathologyLabRepository;
    @Override
    public PathologyLab createTest(PathologyLab pathologyLab) {
        return pathologyLabRepository.save(pathologyLab);
    }

    @Override
    public PathologyLab getPatientTestByTestId(String testId) {
        Optional<PathologyLab> byId = pathologyLabRepository.findById(testId);
        PathologyLab pathologyLab=new PathologyLab();
        if(byId.isPresent()){
            pathologyLab=byId.get();
        }
        return pathologyLab;

    }
}
