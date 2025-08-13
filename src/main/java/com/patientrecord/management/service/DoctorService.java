package com.patientrecord.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.patientrecord.management.model.DoctorModel;
import com.patientrecord.management.repository.DoctorRepository;

@Service
public class DoctorService {

    
	
	@Autowired
	private DoctorRepository repo;

   
	
	    //Post Method
		public DoctorModel save(DoctorModel doctor) {
			DoctorModel saveDoctorModel=repo.save(doctor);
			return saveDoctorModel;
		}

		public DoctorModel addDoctorModel(DoctorModel doctor) {
			
			return repo.save(doctor);
		}
		
	    //Get Method
		public List<DoctorModel> getDoctorModel() {
			return repo.findAll();
		}
        //Put Method
		public DoctorModel updateDoctor(Long id, DoctorModel updateddoctor) {
			DoctorModel existingDoctor = repo.findById(id).get();
			existingDoctor.setName(updateddoctor.getName());
			existingDoctor.setSuccessrate(updateddoctor.getSuccessrate());
			existingDoctor.setSpecialist(updateddoctor.getSpecialist());
			return repo.save(existingDoctor);
		}

		public void deleteDoctro(Long id) {
			repo.deleteById(id);
			
		}
		
}
