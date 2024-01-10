package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.Entity.EmpInformation;

@Service
public interface EmpInformationService {
	public List<EmpInformation> getEmpIfm();
	

}
