package com.hbm.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="P_ID")
	private Integer id;

	private String name;
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL)
	private Set<Address> set = new HashSet<Address>();

	
	public Person(){
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getSet() {
		return set;
	}

	public void setSet(Set<Address> set) {
		this.set = set;
	}
}
