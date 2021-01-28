package com.viz.interview.modules.patients.controllers;

import com.viz.interview.modules.patients.dto.PatientDto;
import com.viz.interview.modules.patients.entities.PatientEntity;
import com.viz.interview.modules.patients.mappers.PatientsMapper;
import com.viz.interview.modules.patients.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("patients")
public class PatientsController {

    PatientsService service;
    PatientsMapper mapper;

    @Autowired
    public PatientsController(PatientsService service) {
        this.service = service;
        this.mapper = new PatientsMapper();
    }

    @RequestMapping(value = "{hospital1Id}/{hospital1Id}", method = RequestMethod.GET)
    List<PatientDto> getAllPatientsTransferredBetween(@PathVariable("hospital1Id") String hospital1Id,
                                                      @PathVariable("hospital2Id") String hospital2Id) {
        List<PatientEntity> scans = service.getAllPatientsTransferredBetween(hospital1Id, hospital2Id);
        return scans.stream().map((scan) -> mapper.patientEntityToPatientDto(scan)).collect(Collectors.toList());
    }
}
