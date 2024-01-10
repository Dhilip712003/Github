package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.Entity.EmpInformation;
import com.employee.repository.EmpRepo;
import com.employee.service.EmpInformationService;
@Component
public class EmpIfmImpl implements EmpInformationService{
	@Autowired
	EmpRepo empRepo;

	@Override
	public List<EmpInformation> getEmpIfm() {
		
		List<EmpInformation> findAll = empRepo.findAll();
		
		return findAll;
	}

}
