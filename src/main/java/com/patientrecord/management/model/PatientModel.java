package com.patientrecord.management.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PatientModel {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String contact;
	
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private DoctorModel doctors;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public DoctorModel getDoctors() {
		return doctors;
	}
	public void setDoctors(DoctorModel doctors) {
		this.doctors = doctors;
	}
	
}
