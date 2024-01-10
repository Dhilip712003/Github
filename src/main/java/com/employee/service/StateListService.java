package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.Entity.StateList;

@Service

public interface StateListService {
	public List<StateList> getstateList();

}
