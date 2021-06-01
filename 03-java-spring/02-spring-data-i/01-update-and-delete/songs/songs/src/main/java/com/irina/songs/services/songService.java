package com.irina.songs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irina.songs.models.Song;
import com.irina.songs.repositories.songRepository;


@Service
public class songService {

	private final songRepository songRepo;
	
	public songService (songRepository a) {
		this.songRepo = a;
	}
	
	// Display All Songs
	public List<Song> getAllSongs(){
		return this.songRepo.findAll();
	}
	
	// Display One Song
	public Song getSingleSong(Long id) {
		return this.songRepo.findById(id).orElse(null);
	}
	
	// Create Song
	public Song createSong(Song a) {
		return this.songRepo.save(a);
	}
	
	// Create Book from constructor 
	public Song createSong2(String name, String singer, int duration) {
		Song newSong = new Song(name, singer, duration);
		return this.songRepo.save(newSong);
	}
	
	// Delete Book
	public void deleteSong(Long id) {
		this.songRepo.deleteById(id);
	}
	
	// Update Book
	public Song updateSong(Song a) {
		return this.songRepo.save(a);
	}
	
	// edit Book from constructor 
	public Song updateSong2(Long id, String name, String singer, int duration) {
		Song songtobeedited = this.getSingleSong(id);
		songtobeedited.setName(name);
		songtobeedited.setSinger(singer);
		songtobeedited.setDuration(duration);
		return this.songRepo.save(songtobeedited);
	}
	

}
