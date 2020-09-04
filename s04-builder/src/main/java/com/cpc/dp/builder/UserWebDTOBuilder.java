package com.cpc.dp.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

	private String fistName;
	private String lastName;
	private String age;
	private String address;
	private UserDTO dto;	
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.fistName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now()); 
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.toString();
		return this;
	}

	@Override
	public UserDTO build() {
		String fullName = this.fistName + " " +this.lastName;
		dto = new UserWebDTO(fullName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
	
	
}
