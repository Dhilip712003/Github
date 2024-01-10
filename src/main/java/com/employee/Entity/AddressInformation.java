package com.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="ADDRESSINFORMATION")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressInformation {
	@Id
	@Column(name="ADDRESSID")
	private int addressId;
	
	
	@Column(name="STREETNMAE")
	private String streetName;
	
	
	@Column(name= "CITYNMAE")
	private String CityNmae;
	
	
	@Column(name="STATENMAE")
	private String statenmae;
	
	
	@Column(name="LANDMARK")
	private String landmark;
	
	
	@Column(name= "PINCODE")
	private int pincode;
	
	
	
	

}
