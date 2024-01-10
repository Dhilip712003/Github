package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.Entity.CityList;
import com.employee.repository.CityRepo;
import com.employee.service.CityListservice;
@Component
public class CityListImpl implements CityListservice{
	@Autowired
	CityRepo cityRepo;
	

	@Override
	public List<CityList> getcityDt() {
		List<CityList> findAll = cityRepo.findAll();
		return findAll;
	}

}
