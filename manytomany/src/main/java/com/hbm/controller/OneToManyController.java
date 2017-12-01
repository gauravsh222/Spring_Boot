package com.hbm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbm.model.Person;
import com.hbm.service.HBMService;

@RestController
@RequestMapping
public class OneToManyController {

	@Autowired
	HBMService service;

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public List<Person> savePerson(@RequestBody Person person) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		return service.save(persons);
	}

	@RequestMapping("persons")
	public List<Person> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/personById/{id}", method = RequestMethod.GET)
	public Person findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/personByName/{name}", method = RequestMethod.GET)
	public Person findByName(@PathVariable String name) {
		return service.findByName(name);
	}

}
