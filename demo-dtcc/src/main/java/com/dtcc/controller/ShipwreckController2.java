package com.dtcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.dao.ShipwreckRepository;
import com.dtcc.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController2 {

	@Autowired
	private ShipwreckRepository repository;
	
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> getAll(){
		return repository.findAll();
		
	}

	@RequestMapping(value="shipwrecks",method=RequestMethod.POST)
	public Shipwreck save(@RequestBody Shipwreck wreck){
		
		return repository.saveAndFlush(wreck);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
