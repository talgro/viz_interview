package com.viz.interview.modules.patients.services;

import com.viz.interview.modules.patients.entities.PatientEntity;
import com.viz.interview.modules.patients.repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PatientsService {
    PatientsRepository repository;

    @Autowired
    public PatientsService(PatientsRepository repository) {
        this.repository = repository;
    }

    public List<PatientEntity> getAllPatientsTransferredBetween(String hospital1Id, String hospital2Id) {
        List<PatientEntity> hospital1Patients = repository.findAllByHospitalId(hospital1Id);
        List<PatientEntity> hospital2Patients = repository.findAllByHospitalId(hospital2Id);

        Set<String> set = new HashSet<>();
        hospital1Patients.stream().forEach((patient) -> set.add(patient.getId()));

        return hospital2Patients.stream()
                .filter((patientEntity -> set.contains(patientEntity.getId())))
                .collect(Collectors.toList());
    }
}