package com.viz.interview.modules.patients.scans.mappers;


import com.viz.interview.modules.patients.scans.dto.ScanDto;
import com.viz.interview.modules.patients.scans.entities.ScanEntity;

public class ScansMapper {

    public ScanDto scanEntityToScanDto(ScanEntity entity) {
        return new ScanDto(entity.getHospitalId(),
                entity.getTimeTaken(),
                entity.getScanId());
    }
}
