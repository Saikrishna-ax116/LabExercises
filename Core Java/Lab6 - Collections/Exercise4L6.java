package exercise4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise4L6 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 95);
        map.put(2, 85);
        map.put(3, 80);
        map.put(4, 74);
        
        Exercise4L6 ex4=new Exercise4L6();
        System.out.println(ex4.getStudent(map));
	}
	
	public Map getStudent(HashMap<Integer,Integer> map)
	{
		Map<Integer,String> count=new HashMap<Integer,String>();
		//1. convert the HashMap to HashSet        
        Set<Entry<Integer, Integer>> set = map.entrySet();
        Iterator<Entry<Integer, Integer>> i = set.iterator();
        while(i.hasNext())
        {
        	Entry<Integer, Integer> marks = i.next();
        	if(marks.getValue()>=90)
        	{
        		count.put(marks.getKey(),"Gold");
        	}
        	else if((marks.getValue()>=80 && marks.getValue()<90)) {
        		count.put(marks.getKey(),"Silver");
        	}
        	else if((marks.getValue()>=80 && marks.getValue()<90))
        	{
        		count.put(marks.getKey(),"Bronze");

        	}
        	else
        	{
        		count.put(marks.getKey(),"No medal");

        	}
        }       
        
		return count;
	}	

}
