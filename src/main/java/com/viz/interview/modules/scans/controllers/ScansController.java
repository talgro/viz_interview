package com.viz.interview.modules.scans.controllers;

import com.viz.interview.modules.scans.dto.ScanDto;
import com.viz.interview.modules.scans.entities.ScanEntity;
import com.viz.interview.modules.scans.mappers.ScansMapper;
import com.viz.interview.modules.scans.services.ScansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("scans")
public class ScansController {

    ScansService service;
    ScansMapper mapper;

    @Autowired
    public ScansController(ScansService service) {
        this.service = service;
        this.mapper = new ScansMapper();
    }

    @RequestMapping(value = "/{patientId}", method = RequestMethod.GET)
    List<ScanDto> getAllScansForPatient(@PathVariable("patientId") String patientId) {
        List<ScanEntity> scans = service.getAllScansForPatient(patientId);
        return scans.stream().map((scan) -> mapper.scanEntityToScanDto(scan)).collect(Collectors.toList());
    }
}
