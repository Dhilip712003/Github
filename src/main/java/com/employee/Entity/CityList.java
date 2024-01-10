package com.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CITYLIST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityList {
	
	@Id
	@Column(name=" CITYID")
	private int cityId;
	
	@Column(name="CITYNAME")
	private String cityNmae;

}
