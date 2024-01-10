package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.EmpInformation;


public interface EmpRepo extends JpaRepository<EmpInformation, Integer> {
	

}
