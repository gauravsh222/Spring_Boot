package com.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbm.model.ContractEmployee;
import com.hbm.model.Employee;
import com.hbm.model.RegularEmployee;
import com.hbm.service.TPSCService;

@RestController
@RequestMapping("/")
public class TablePerSubClassController {
	
	@Autowired
	TPSCService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.save(employee);
	} 
	
	@RequestMapping(value="/save_reg", method=RequestMethod.POST)
	public Employee saveRegEmployee(@RequestBody RegularEmployee reg_Eployee) {
		return service.save(reg_Eployee);
	}
	
	@RequestMapping(value="/save_cont", method=RequestMethod.POST)
	public Employee saveContEmployee(@RequestBody ContractEmployee cont_Eployee) {
		return service.save(cont_Eployee);
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> findEmployees() {
		return service.findAll();
	}
}
