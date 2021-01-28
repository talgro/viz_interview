package com.viz.interview.modules.patients.scans.entities.keys;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
public class ScanEntityPKey implements Serializable {
  private LocalDateTime timeTaken;
  private String patientId;
}