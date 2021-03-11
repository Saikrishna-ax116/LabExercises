package lab_3;

import java.util.Scanner;

public class Exercise3 {
    public static String alterString(String s){
        String finalString = "";
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);

            if(c == 'A' || c == 'E' || c =='I' || c =='O' || c=='U'){
                finalString += c;
            }
            else {
            	char temp = (char) (((int) c )+ 1);
                finalString += temp;
            }
           
        }
        return finalString;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println(alterString(str));
        sc.close();

	}

}