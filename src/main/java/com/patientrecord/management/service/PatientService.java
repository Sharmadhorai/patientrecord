package com.patientrecord.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientrecord.management.model.PatientModel;
import com.patientrecord.management.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository repo;
	
	//Post Method
	public PatientModel save(PatientModel patient) {
		PatientModel savePatientModel=repo.save(patient);
		return savePatientModel;
	}

	public PatientModel addPatientModel(PatientModel patient) {
		
		return repo.save(patient);
	}
	
    //Get Method
	public List<PatientModel> getPatientModel() {
		return repo.findAll();
	}
	
    //Delete Method
	public void deletePatient(Long id) {
		repo.deleteById(id);
		
	}
	
    //Put Method     
	public PatientModel updatePatient(Long id, PatientModel updatedpatient) {
		PatientModel existingPatient=repo.findById(id).get();
		existingPatient.setName(updatedpatient.getName());
		existingPatient.setAge(updatedpatient.getAge());
		existingPatient.setContact(updatedpatient.getContact());
		existingPatient.setDoctors(updatedpatient.getDoctors());
		return repo.save(existingPatient);
	}

	
}
