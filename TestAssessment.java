package DemoPractise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "aaebbcdd";
		List<Character> newlist = new ArrayList<Character>();
		   
		   
		   for(int i=0;i<s.length();i++) {
			   newlist.add(s.charAt(i));
			   
		   }
		   
		   System.out.println(newlist.toString());
		   
	Map<Character, Long> nonrepetitive =newlist.stream().map(c->c.charValue()).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
	
	    System.out.println(nonrepetitive.entrySet().stream().filter(entry->entry.getValue()==1).findFirst());
	     
		

	}

}
