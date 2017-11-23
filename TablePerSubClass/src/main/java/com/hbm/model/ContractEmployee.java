package com.hbm.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TPSC_CON_EMPLOYEE")
@PrimaryKeyJoinColumn
public class ContractEmployee extends Employee {

	private Float payPerHour;
	
	private String contractPeriod;

	public Float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(Float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
}
