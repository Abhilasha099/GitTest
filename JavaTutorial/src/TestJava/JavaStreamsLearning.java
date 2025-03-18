package TestJava;

import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreamsLearning {

	public static void main(String[] args) {
		
		//count number of names starting with alphabet A in list
		streamFilter();
		/*ArrayList<String> names= new ArrayList<String>();
		names.add("Abhilasha");
		names.add("Sheena");
		names.add("Aliya");
		names.add("Rahul");
		names.add("Gagan");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
				
			}
			
		}
		
		System.out.println(count);*/
	}
	
	public static void streamFilter()
	
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhilasha");
		names.add("Sheena");
		names.add("Alia");
		names.add("Rahul");
		names.add("Gagan");
		names.add("Aish");
		
		//names.stream().forEach(n->System.out.println(n));--for printing all elements
		Long c=names.stream().filter(n->n.startsWith("A")).count();
		System.out.println(c);
		Long d=  Stream.of("Neha","Rakesh","Yatin","Trisha","Rishi")
				.filter(s->s.startsWith("R"))
				.count(); 
		System.out.println(d);
	//there is no life of intermediate operations if there is no terminal operation
		//terminal operation only executes if intermediate op(filter) returns true
		
		//print all the names present in arraylist
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.endsWith("n")).forEach(s->System.out.println(s));

}
}