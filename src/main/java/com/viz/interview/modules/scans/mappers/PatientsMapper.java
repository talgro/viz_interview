package com.viz.interview.modules.scans.mappers;


import com.viz.interview.modules.scans.dto.PatientDto;
import com.viz.interview.modules.scans.entities.PatientEntity;

public class PatientsMapper {

    public PatientDto patientEntityToPatientDto(PatientEntity entity) {
        return new PatientDto(entity.getId(), entity.getFirstName(), entity.getLastName());
    }
}
