package com.spring.mapautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boot.Employee;
import com.google.gson.Gson;

@RestController
public class Controller2 {
	
	@Autowired
	private Service ser;
	
	@RequestMapping("/print")
	private void test() {
		ser.test();	
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public void create(@RequestBody String request
			) throws ClassNotFoundException {
		/*HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(request, headers);
		ResponseEntity<String> responseEntity = new RestTemplate().
					postForEntity("http://localhost:1010/vnfmlcm/v1/vnf_instances", request, String.class);*/
		
		System.err.println("Client");
		
		/*HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(request, headers);*/
		
/*		Employee emp = new Employee();
		emp.setName("Init");
		emp.setSalary(00.00);*/
		
		Gson gson = new Gson();
		Employee emp = gson.fromJson(request, Employee.class);
		ResponseEntity<String> responseEntity = new RestTemplate().
				postForEntity("http://localhost:8080/emp", emp, String.class);
		System.out.println(responseEntity.getBody());
	}
}
