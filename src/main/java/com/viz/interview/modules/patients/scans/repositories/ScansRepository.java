package com.viz.interview.modules.patients.scans.repositories;

import com.viz.interview.modules.patients.scans.entities.ScanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScansRepository extends JpaRepository<ScanEntity, String> {
    List<ScanEntity> findAllById(String id);

    @Query(value = "select id, name from test where test.id = :id", nativeQuery = true)
    ScanEntity findByIdNative(int id);
}
