package com.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EMPLOYEEINFORMATION")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpInformation {
	@Id
	@Column(name=" EMPID")
	private int empId;
	
	@Column(name=" EMPNAME")
	private int empName;
	
	@Column(name=" EMAILID")
	private int emailId;
	
	@Column(name="  PHNONE")
	private int phoneNo;
	
	@Column(name=" DATEOFMONTH")
	private int dateofmonth;
	
	@Column(name=" DATEOFJOINING")
	private int dateofjoining;
	
	@Column(name=" COMPANYNAME")
	private int companyNmae;
	
	@Column(name="  COMPANYNAME")
	private int companyAddress;
	
	@Column(name=" SALARY")
	private int salary;


}
