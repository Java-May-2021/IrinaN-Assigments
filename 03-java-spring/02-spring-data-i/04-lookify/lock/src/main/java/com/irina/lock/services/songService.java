package com.irina.lock.services;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import com.irina.lock.models.Song;
import com.irina.lock.repositories.songRepository;

@Service
public class songService {
	private final songRepository songRepo;
	
	public songService (songRepository a) {
		this.songRepo = a;
	}
	
	// Display All Languages
	public List<Song> getAllSongs(){
		return this.songRepo.findAll();
	}
	
	// Display One Language
	public Song getSingleSong(Long id) {
		return this.songRepo.findById(id).orElse(null);
	}
	
	// Create Language
	public Song createSong(Song a) {
		return this.songRepo.save(a);
	}
	
	// Create Language from constructor 
	public Song createSong2(String title, String artist, int rating) {
		Song newSong = new Song(title, artist, rating);
		return this.songRepo.save(newSong);
	}
	
	// Delete a Language
	public void deleteSong(Long id) {
		this.songRepo.deleteById(id);
	}
	
	// Update a Language
	public Song updateSong(Song a) {
		return this.songRepo.save(a);
	}
	
	// edit Language from constructor 
	public Song updateSong2(Long id, String title, String artist, int rating) {
		Song songtobeedited = this.getSingleSong(id);
		songtobeedited.setTitle(title);
		songtobeedited.setArtist(artist);
		songtobeedited.setRating(rating);
		return this.songRepo.save(songtobeedited);
	}
	
	public List<Song> topTenByRating() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> songsContainingArtist(String artist) {
		return songRepo.findByArtistContaining(artist);
	}
	
	// sorting songs by rating
//	public List<Song> sortedsongs(){
//		return this.songRepo.findAll(Sort.by("rating").descending());
//	}
	


}
