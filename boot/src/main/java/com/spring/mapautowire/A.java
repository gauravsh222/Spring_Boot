package com.spring.mapautowire;

import org.springframework.stereotype.Component;

@Component(value="OT")
public class A implements I {
	
	public A() {
		System.out.println("OT-A is created");
	}

	@Override
	public void m1() {
		System.out.println("OT-A-m1()");
	}
	
}
