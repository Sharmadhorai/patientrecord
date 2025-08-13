package com.patientrecord.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientrecord.management.model.DoctorModel;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {

}
