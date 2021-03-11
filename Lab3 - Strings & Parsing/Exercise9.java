package lab3;

import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {
	 public static void main(String[] args)
	    {
	        LocalDate PrevDate = LocalDate.of(2019, 10, 12);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(PrevDate, now);
	 
	     System.out.printf("Difference in the given date is %d years, %d months and %d days old", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
}
