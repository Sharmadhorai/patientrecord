package com.patientrecord.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientrecord.management.model.PatientModel;

@Repository
public interface PatientRepository extends JpaRepository<PatientModel, Long> {

}
