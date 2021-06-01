package com.irina.lock.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.lock.models.Song;

@Repository 

public interface songRepository extends CrudRepository<Song, Long> {
	List<Song> findAll(); 
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtistContaining(String artist);
}
