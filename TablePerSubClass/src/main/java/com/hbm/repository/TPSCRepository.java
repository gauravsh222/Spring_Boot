package com.hbm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbm.model.Employee;

public interface TPSCRepository extends JpaRepository<Employee, Serializable> {

	Employee findByName(String name);
}
