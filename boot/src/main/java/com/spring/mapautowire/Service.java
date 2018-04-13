package com.spring.mapautowire;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	/*@Autowired
	@Qualifier(value="OT")
	I ot ;
	
	@Autowired
	@Qualifier(value="OM")
	I om;*/
	
	@Autowired
	List<I> list;
	
	@Autowired
	Map<String, I> map;
	
	public void test() {
		System.out.println(map);
		/*om.m1();
		ot.m1();*/
	}
}
