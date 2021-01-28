package com.viz.interview.modules.scans.services;

import com.viz.interview.modules.scans.entities.ScanEntity;
import com.viz.interview.modules.scans.repositories.ScansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScansService {
    ScansRepository repository;

    @Autowired
    public ScansService(ScansRepository repository) {
        this.repository = repository;
    }

    public List<ScanEntity> getAllScansForPatient(String patientId) {
        List<ScanEntity> list = repository.findAllById(patientId);
        return list;
    }

//    public void postTest(int id, String name) {
//        ScanEntity testEntity = new ScanEntity(id, name);
//        repository.save(testEntity);
//    }

}