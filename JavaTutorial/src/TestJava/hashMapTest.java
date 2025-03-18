package TestJava;

import java.util.HashMap;

public class hashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("T001", "Apple");
		map.put("T002", "Banana");
		map.put("T003", "Mango");
		map.put("T004", "Papaya");
		
		System.out.println("Before removing");
		System.out.println("");
		for(String i : map.keySet())
		{
		System.out.println(map.get(i));
		}
		
		map.remove("T003");
		System.out.println("");		
System.out.println("After removing");
System.out.println("");
		for(String i : map.keySet())
		{
		System.out.println(map.get(i));
		}

	}

}
