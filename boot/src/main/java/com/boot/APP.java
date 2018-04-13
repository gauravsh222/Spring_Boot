package com.boot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class APP {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Init");
		emp.setSalary(00.00);
		ResponseEntity<String> responseEntity = new RestTemplate().
				postForEntity("http://localhost:8080/emp", emp, String.class);
		System.out.println(responseEntity.getBody());
	}
}
