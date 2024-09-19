package com.testsigma.Database.Comparition.service;

import com.testsigma.Database.Comparition.model.SampleEntity;
import com.testsigma.Database.Comparition.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public List<SampleEntity> findAll() {
        return sampleRepository.findAll();
    }

    public SampleEntity save(SampleEntity entity) {
        return sampleRepository.save(entity);
    }
}

