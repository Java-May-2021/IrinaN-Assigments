package com.irina.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irina.songs.models.Song;
import com.irina.songs.services.songService;

@RestController
@RequestMapping("/api")
public class Apihome {
	@Autowired
	private songService sService;
	
	@GetMapping("")

	public List<Song> getSongs(){
		return this.sService.getAllSongs();
	}
	
	@GetMapping("/{id}")
	public Song getSingle(@PathVariable("id") Long id) {
		return this.sService.getSingleSong(id);
	}
	
	@PostMapping("/create")
	public Song creatingSong(Song a) {
		return this.sService.createSong(a);

}
}