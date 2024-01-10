package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.StateList;

public interface StateRepo extends JpaRepository<StateList, Integer>{

}
