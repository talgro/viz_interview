package com.viz.interview.modules.scans.entities;

import com.viz.interview.modules.scans.entities.keys.ScanEntityPKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.time.LocalDateTime;

@Entity(name = "scans")
@IdClass(ScanEntityPKey.class)
public class ScanEntity {
    @Id
    private LocalDateTime timeTaken;

    @Id
    private String patientId;

    private String hospitalId;

    private String scanId;

    public ScanEntity() {
    }

    public ScanEntity(String hospitalId, LocalDateTime timeTaken, String patientId, String scanId) {
        this.hospitalId = hospitalId;
        this.timeTaken = timeTaken;
        this.patientId = patientId;
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

    public void setTimestamp(LocalDateTime timestamp) {
        this.timeTaken = timestamp;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getScanId() {
        return scanId;
    }

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }
}
