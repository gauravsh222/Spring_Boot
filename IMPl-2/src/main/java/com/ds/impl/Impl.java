package com.ds.impl;

import org.springframework.stereotype.Component;

import com.ds.intr.Interaface;

@Component(value="baby")
public class Impl implements Interaface {
	public Impl() {
		System.err.println("IMPL-2");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IMPL-2";
	}
}
