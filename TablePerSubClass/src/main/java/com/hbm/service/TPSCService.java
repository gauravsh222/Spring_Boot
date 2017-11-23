package com.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbm.model.Employee;
import com.hbm.repository.TPSCRepository;

@Service
public class TPSCService {
	
	@Autowired
	private TPSCRepository repo;
	
	public Employee save(Employee employee) {
		return repo.save(employee);
	}
	
	public List<Employee> findAll() {
		return repo.findAll();
	}
	
}
