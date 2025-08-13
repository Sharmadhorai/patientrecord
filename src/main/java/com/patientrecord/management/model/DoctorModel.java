package com.patientrecord.management.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DoctorModel {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String specialist;
	private int successrate;
	
	@OneToMany(mappedBy = "doctors",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<PatientModel> patients;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getSuccessrate() {
		return successrate;
	}
	public void setSuccessrate(int successrate) {
		this.successrate = successrate;
	}
	
}
