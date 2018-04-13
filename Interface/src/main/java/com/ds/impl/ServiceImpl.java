package com.ds.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.intr.Interaface;
import com.ds.serI.IService;

@Component
public class ServiceImpl implements IService {
	
	@Autowired
	private Map<String, Interaface> map;
	@Autowired
	private List<Interaface> list;

	public ServiceImpl() {
		System.err.println("ServiceImpl");
	}
	
	public void implM1(){
		System.out.println("IMPL : " + map.getClass());
		System.err.println("list "+list);
	}
}
