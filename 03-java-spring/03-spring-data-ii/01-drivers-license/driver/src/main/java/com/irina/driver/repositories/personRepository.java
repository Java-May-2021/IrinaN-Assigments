package com.irina.driver.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.driver.models.Person;

@Repository 

public interface personRepository extends CrudRepository<Person, Long>  {
	List<Person> findAll(); 

}
