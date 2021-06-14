package com.irina.dojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.dojoAndNinjas.models.Dojo;

@Repository 
public interface dojoRepository extends CrudRepository<Dojo, Long>  {
	List<Dojo> findAll(); 
	

}

