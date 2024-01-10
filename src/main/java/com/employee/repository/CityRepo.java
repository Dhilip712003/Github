package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.CityList;


public interface CityRepo extends JpaRepository<CityList, Integer>{
	
}
