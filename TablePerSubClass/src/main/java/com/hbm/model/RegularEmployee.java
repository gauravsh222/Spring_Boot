package com.hbm.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="TPSC_REG_EMPLOYEE")
@PrimaryKeyJoinColumn
public class RegularEmployee extends Employee {
	
	private Double salary;
	
	private Double bonus;

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}
