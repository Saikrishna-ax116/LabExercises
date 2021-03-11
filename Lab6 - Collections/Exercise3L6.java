package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Exercise3L6 {
 
    public static void main(String[] args) {
    	int[] arr= {2,3,4,5};
    	Exercise3L6 ex3=new Exercise3L6();
    	System.out.println(ex3.getSquares(arr));
    }

    //Accepts a list of numbers and return their squares
    public Map getSquares(int[] nums) {
    	Map<Integer,Integer> count=new HashMap<Integer,Integer>();
    	for(int i: nums)
    	{
    		count.put(i, i*i);
    	}
        return count;

    }
 
}