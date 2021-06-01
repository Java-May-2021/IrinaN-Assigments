package com.irina.langs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.langs.models.Lang;

@Repository 
public interface langRepository extends CrudRepository<Lang, Long>  {
	List<Lang> findAll(); 
}
