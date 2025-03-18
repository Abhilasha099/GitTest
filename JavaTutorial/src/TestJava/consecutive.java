package TestJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find pairs of consecutive number left to right in a given string- 
		//"967462389ujk126c3756mnw012xty"
		//[“Math”, 98], [“Data Structure”, 85], [“Database”, 91], [“Java”, 95], [“Operating System”, 79], [“Networking”, 80]

		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		
		Collection<Integer> col= hm.values();
		col.stream().sorted().forEach(s->System.out.println(s));
		
		//for(String str : hm)
		{	
			
		
{
	

}

		}
	}
	

}
