package com.dtcc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.model.Shipwreck;

@RequestMapping("api/v0/")
@RestController
public class ShipwreckController {

	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
//	@ResponseBody
	public Shipwreck save(@RequestBody Shipwreck wreck){
		return ShipwreckStub.create(wreck);
	}
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.GET)
	public List<Shipwreck> get(){
		
		return ShipwreckStub.list();
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.GET)
	public Shipwreck get(@PathVariable long id){
		
		return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.PUT)
	public Shipwreck update(@PathVariable long id, @RequestBody Shipwreck wreck){
		return ShipwreckStub.update(id, wreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id){
		return ShipwreckStub.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
