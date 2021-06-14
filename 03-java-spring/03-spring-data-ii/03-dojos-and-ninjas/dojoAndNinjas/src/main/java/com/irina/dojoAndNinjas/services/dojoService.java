package com.irina.dojoAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irina.dojoAndNinjas.models.Dojo;
import com.irina.dojoAndNinjas.repositories.dojoRepository;

@Service 
public class dojoService {
private final dojoRepository dRepo;
	
	public dojoService (dojoRepository a) {
		this.dRepo = a;
	}
	
	// Display All Dojos
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	
	// Display One Dojo
	public Dojo getSingleDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	// Create Dojo
	public Dojo createDojo(Dojo a) {
		return this.dRepo.save(a);
	}
	
	// Create Book from constructor 
	public Dojo createBook2(String name) {
		Dojo newDojo = new Dojo(name);
		return this.dRepo.save(newDojo);
	}
	
	// Delete Dojo
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
	


}
