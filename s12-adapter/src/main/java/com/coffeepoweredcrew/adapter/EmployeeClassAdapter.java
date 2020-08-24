package com.coffeepoweredcrew.adapter;

/**
 * A class adapter, works as Two-way adapter
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	public EmployeeClassAdapter() {
	
	}
	
	
	@Override
	public String getName() {	
		return this.getFullName();
	}

	@Override
	public String getDesignation() {	
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}
	
}
