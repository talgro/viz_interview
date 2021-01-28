package com.viz.interview.modules.patients.mappers;


import com.viz.interview.modules.patients.dto.PatientDto;
import com.viz.interview.modules.patients.entities.PatientEntity;

public class PatientsMapper {

    public PatientDto patientEntityToPatientDto(PatientEntity entity) {
        return new PatientDto(entity.getId(), entity.getFirstName(), entity.getLastName());
    }
}
