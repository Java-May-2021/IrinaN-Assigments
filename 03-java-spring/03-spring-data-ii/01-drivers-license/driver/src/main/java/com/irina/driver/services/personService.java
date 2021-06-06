package com.irina.driver.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irina.driver.models.License;
import com.irina.driver.models.Person;
import com.irina.driver.repositories.personRepository;

@Service

public class personService {
	private final personRepository pRepo;
	
	public personService (personRepository a) {
		this.pRepo = a;
	}
	
	// Display All Languages
	public List<Person> getAllPersons(){
		return this.pRepo.findAll();
	}
	
	// Display One Language
	public Person getSinglePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	// Create Language
	public Person createPerson(Person a) {
		return this.pRepo.save(a);
	}
	
	// Create Language from constructor 
	public Person createPerson2(String firstName, String lastName, License license) {
		Person newPerson = new Person(firstName, lastName, license);
		return this.pRepo.save(newPerson);
	}
	
	// Create Language from constructor 
	public Person createPerson3(String firstName, String lastName) {
		Person newPerson = new Person(firstName, lastName);
		return this.pRepo.save(newPerson);
		}
	
	// Delete a Language
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
	
	// Update a Language
	public Person updateSong(Person a) {
		return this.pRepo.save(a);
	}
	
	// edit Language from constructor 
	public Person updateSong2(Long id, String firstName, String lastName, License license) {
		Person persontobeedited = this.getSinglePerson(id);
		persontobeedited.setFirstName(firstName);
		persontobeedited.setLastName(lastName);
		persontobeedited.setLicense(license);
		return this.pRepo.save(persontobeedited);
	}
	


}
