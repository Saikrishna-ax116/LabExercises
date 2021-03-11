package org;

public class Exercise1L5 {
	
	public static void main(String[] args) {
		
		int age = 13;
		try {
		checkAge(age);
		}
		catch(AgeLimit e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done");
		}
	}
	
	static void checkAge(int age) throws AgeLimit {
		
		if (age>15) {
			System.out.println("Your age is "+age);
		}
		else {
			throw new AgeLimit(age);
		}
		
	}

}
