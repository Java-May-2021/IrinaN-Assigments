package com.irina.langs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irina.langs.models.Lang;
import com.irina.langs.repositories.langRepository;

@Service

public class langService {
	private final langRepository langRepo;
	
	public langService (langRepository a) {
		this.langRepo = a;
	}
	
	// Display All Languages
	public List<Lang> getAllLangs(){
		return this.langRepo.findAll();
	}
	
	// Display One Language
	public Lang getSingleLang(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	// Create Language
	public Lang createLang(Lang a) {
		return this.langRepo.save(a);
	}
	
	// Create Language from constructor 
	public Lang createlang2(String name, String creator, int version) {
		Lang newLang = new Lang(name, creator, version);
		return this.langRepo.save(newLang);
	}
	
	// Delete a Language
	public void deleteLang(Long id) {
		this.langRepo.deleteById(id);
	}
	
	// Update a Language
	public Lang updateLang(Lang a) {
		return this.langRepo.save(a);
	}
	
	// edit Language from constructor 
	public Lang updateLang2(Long id, String name, String creator, int version) {
		Lang langtobeedited = this.getSingleLang(id);
		langtobeedited.setName(name);
		langtobeedited.setCreator(creator);
		langtobeedited.setVersion(version);
		return this.langRepo.save(langtobeedited);
	}
	

	

}
