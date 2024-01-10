package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Entity.AddressInformation;

@Repository
public interface AddressRepo extends JpaRepository<AddressInformation, Integer>{
	
	

}
