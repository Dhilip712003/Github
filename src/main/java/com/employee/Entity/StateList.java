package com.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="STATELIST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateList {
	
	@Id
	@Column(name="STATEID")
	private int stateId;
	
	@Column(name="STATENAME")
	private String StateNmae;

}
