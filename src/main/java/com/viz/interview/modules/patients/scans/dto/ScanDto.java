package com.viz.interview.modules.patients.scans.dto;


import java.time.LocalDateTime;

public class ScanDto {
    private String hospitalId;
    private LocalDateTime timeTaken;
    private String scanId;

    public ScanDto() {
    }

    public ScanDto(String hospitalId, LocalDateTime timeTaken, String scanId) {
        this.hospitalId = hospitalId;
        this.timeTaken = timeTaken;
        this.scanId = scanId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public LocalDateTime getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(LocalDateTime timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getScanId() {
        return scanId;
    }

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }
}
