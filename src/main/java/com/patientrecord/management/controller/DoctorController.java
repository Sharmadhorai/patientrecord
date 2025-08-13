package com.patientrecord.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientrecord.management.model.DoctorModel;
import com.patientrecord.management.service.DoctorService;



@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
private DoctorService service;
	
	@PostMapping
	public DoctorModel save(@RequestBody DoctorModel doctor) {
		return service.addDoctorModel(doctor);
	}
	@GetMapping
	public List<DoctorModel> getAllDoactorModel(){
		return service.getDoctorModel();
	}
	@PutMapping("/{id}")
	public DoctorModel updateDoctorModel(@PathVariable Long id,@RequestBody DoctorModel doctor) {
		return service.updateDoctor(id , doctor);
	}
	@DeleteMapping("/{id}")
	public String deleteDoctor(@PathVariable Long id) {
		service.deleteDoctro(id);
		return "Doctor Id Deleted Successfully";
	}
}
