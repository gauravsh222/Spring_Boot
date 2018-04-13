package com.ds;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ds.serI.IService;

@RestController
public class Controller {
	@Autowired
	private IService ser;
	
	@RequestMapping("/print")
	private void print() {
		System.err.println("print : " + ser.getClass());	
		ser.implM1();
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public ResponseEntity<String> createInstance(@RequestBody Employee emp) throws ClassNotFoundException, IOException {
		System.out.println(emp);
		emp.setName("Simulator");
		return new ResponseEntity<String>(emp.toString(),
				HttpStatus.OK);
	}
}
