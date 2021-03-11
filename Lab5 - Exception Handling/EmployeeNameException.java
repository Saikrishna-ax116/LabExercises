package org;

public class EmployeeNameException extends Exception {
	
	String firtsName;
	String lastName;
		
	public EmployeeNameException() {
		super();
	}

	public EmployeeNameException(String firtsName, String lastName) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return "firstName and lastName is blank";
	}
	
	
}
