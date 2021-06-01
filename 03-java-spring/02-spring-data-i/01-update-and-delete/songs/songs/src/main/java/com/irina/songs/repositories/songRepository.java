package com.irina.songs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irina.songs.models.Song;

@Repository
public interface songRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
}
