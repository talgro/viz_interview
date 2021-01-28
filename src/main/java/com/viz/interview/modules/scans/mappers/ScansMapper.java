package com.viz.interview.modules.scans.mappers;


import com.viz.interview.modules.scans.dto.ScanDto;
import com.viz.interview.modules.scans.entities.ScanEntity;

public class ScansMapper {

    public ScanDto scanEntityToScanDto(ScanEntity entity) {
        return new ScanDto(entity.getHospitalId(),
                entity.getTimeTaken(),
                entity.getScanId());
    }
}
