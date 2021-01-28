package com.viz.interview.modules.patients.repositories;

import com.viz.interview.modules.patients.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientsRepository extends JpaRepository<PatientEntity, String> {
    @Query(value = "select p.id, \n" +
            "p.firstName, \n" +
            "p.lastName \n" +
            "count() \n" +
            "from patients p \n" +
            "left join scans s\n" +
            "on p.id = s.patientId\n" +
            "where s.hospitalId = :hospitalId\n" +
            "group by p.id, p.firstName, p. lastName",
            nativeQuery = true)
    List<PatientEntity> findAllByHospitalId(String hospitalId);
}