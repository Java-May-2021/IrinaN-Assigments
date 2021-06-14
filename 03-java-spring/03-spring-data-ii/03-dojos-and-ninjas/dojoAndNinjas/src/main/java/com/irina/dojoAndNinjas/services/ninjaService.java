package com.irina.dojoAndNinjas.services;

import org.springframework.stereotype.Service;

import com.irina.dojoAndNinjas.models.Dojo;
import com.irina.dojoAndNinjas.models.Ninja;
import com.irina.dojoAndNinjas.repositories.ninjaRepository;

@Service
public class ninjaService {
private final ninjaRepository nRepo;
	
	public ninjaService (ninjaRepository a) {
		this.nRepo = a;
	}
	
	// Create Ninja
	public Ninja createNinja(Ninja a) {
		return this.nRepo.save(a);
	}

	
	// Create Book from constructor 
	public Ninja createNinja2(String fName, String lName, int age, Dojo dojo) {
		Ninja newNinja = new Ninja(fName, lName, age, dojo);
		return this.nRepo.save(newNinja);
	}
	
	
	

	

}
