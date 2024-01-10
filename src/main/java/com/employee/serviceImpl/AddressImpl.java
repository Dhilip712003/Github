package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.Entity.AddressInformation;
import com.employee.repository.AddressRepo;
import com.employee.service.AddressInformationService;
@Component
public class AddressImpl implements AddressInformationService{
@Autowired
AddressRepo addressRepo;

	@Override
	public List<AddressInformation> getAdressInfm() {
		List<AddressInformation> findAll = addressRepo.findAll();
		return findAll;
	}
	
	}


