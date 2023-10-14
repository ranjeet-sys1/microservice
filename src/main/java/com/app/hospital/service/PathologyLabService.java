package com.app.hospital.service;

import com.app.hospital.entity.PathologyLab;

public interface PathologyLabService {
    PathologyLab createTest(PathologyLab pathologyLab);
    PathologyLab getPatientTestByTestId(String testId);
}
