package com.irina.updateAndDelete.repositories;

import org.springframework.data.repository.CrudRepository;

import com.irina.updateAndDelete.models.book;

import java.util.*;

public interface BookRepository extends CrudRepository<book, Long>{
	// this method retrieves all the books from the database
    List<book> findAll();
    // this method find a book by their description
    List<book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);

}
