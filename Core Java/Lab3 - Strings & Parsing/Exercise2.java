package lab_3;

import java.util.Scanner;

public class Exercise2 {
	
	public static String getImage(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		return s + "|" + reverse;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		System.out.println(getImage(sc.next()));
		sc.close();
	}
}