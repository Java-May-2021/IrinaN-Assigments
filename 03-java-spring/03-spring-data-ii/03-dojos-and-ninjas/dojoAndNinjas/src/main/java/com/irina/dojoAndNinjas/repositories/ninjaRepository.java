package com.irina.dojoAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.dojoAndNinjas.models.Ninja;

@Repository 
public interface ninjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
