package com.patientrecord.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientrecord.management.model.PatientModel;
import com.patientrecord.management.service.PatientService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	@PostMapping
	public PatientModel save(@RequestBody PatientModel patient) {
		return service.addPatientModel(patient);
	}
	@GetMapping
	public List<PatientModel> getAllPatientModels(){
		return service.getPatientModel();
	}
	@DeleteMapping("/{id}")
	public String deletePatient(@PathVariable Long id) {
		service.deletePatient(id);
		return"Patient Id Deleted Successfully";
	}
	@PutMapping("/{id}")
	public PatientModel updatePateintModel(@PathVariable Long id,@RequestBody PatientModel patient) {
		return service.updatePatient(id,patient);
	}
	 
	

}
