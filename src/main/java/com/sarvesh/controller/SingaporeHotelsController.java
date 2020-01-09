package com.sarvesh.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarvesh.model.SingaporeHotel;
import com.sarvesh.repository.SingaporeHotelRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SingaporeHotelsController {

	@Autowired
	private SingaporeHotelRepository shaRepo;
	
	
	@GetMapping("/all-hotels-list")
	public List<SingaporeHotel> getAllHotels()
	{
		return shaRepo.findSortedAll();
	}
	
	@PostMapping("/create")
	public Iterable<SingaporeHotel> crate(@RequestBody List<SingaporeHotel> objs)
	{
		
		return shaRepo.saveAll(objs);
	}
	@GetMapping("/findbyname/{name}")
	public List<SingaporeHotel> findByName(@PathVariable String name)
	{
		return shaRepo.findByName(name);
	}
}
