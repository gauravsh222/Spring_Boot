package com.spring.mapautowire;

import org.springframework.stereotype.Component;

@Component
public class B implements I {

	public B() {
		System.out.println("B is created");
	}
	@Override
	public void m1() {
		System.out.println("B-m1()");
	}

}
