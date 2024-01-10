package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.Entity.StateList;
import com.employee.repository.StateRepo;
import com.employee.service.StateListService;
@Component
public class StateListImpl implements StateListService{
	@Autowired
	StateRepo stateRepo;

	@Override
	public List<StateList> getstateList() {
		List<StateList> findAll = stateRepo.findAll();
		return findAll;
	}

}
