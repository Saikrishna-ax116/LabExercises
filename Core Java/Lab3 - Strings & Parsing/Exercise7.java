package lab_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in YYYY-MM-DD format:");
		String[] str = sc.next().split("-");
		LocalDate pdate = LocalDate.of(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference => %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
        sc.close();

	}

}