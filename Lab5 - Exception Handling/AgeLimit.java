package org;

public class AgeLimit extends Exception {
	
	int age;
    AgeLimit(int age) {
        this.age = age;
    }
	
	public String toString() {
		
		return "Your are "+age+ " year old. Come back when you're 15"; 
		
	}
	
	

}
