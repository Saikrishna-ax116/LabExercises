package org;

public class Exercise2L5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Sai";
		String lastName = "Krishna";
		
		try {
		checkEmployeeName(firstName, lastName);
		}
		catch(EmployeeNameException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done");
		}

	}
	public static void checkEmployeeName (String firstName, String lastName) throws EmployeeNameException {
		
		if (firstName != "" || lastName != "") {
			System.out.println("Hello, "+firstName+" "+lastName);
			}
		
		else { 
			throw new EmployeeNameException();
		}
	}
}
