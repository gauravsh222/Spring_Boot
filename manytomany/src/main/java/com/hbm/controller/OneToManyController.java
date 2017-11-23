package com.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbm.model.Address;
import com.hbm.model.Person;
import com.hbm.service.HBMService;

@RestController
@RequestMapping("/")
public class OneToManyController {
	
	@Autowired
	HBMService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Person save(@RequestBody Person person) {
		for(Address add : person.getSet()) {
			add.setPerson(person);
		}
		return service.save(person);
	} 
	
	@RequestMapping(value="/persons", method=RequestMethod.GET)
	public List<Person> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/personById/{id}", method=RequestMethod.GET)
	public Person findById(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@RequestMapping(value="/personByName/{name}", method=RequestMethod.GET)
	public Person findByName(@PathVariable String name){
		return service.findByName(name);
	}
	
}
