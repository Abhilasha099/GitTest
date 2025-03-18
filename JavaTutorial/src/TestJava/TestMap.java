package TestJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print names which have last lettter as "a" and convert it into uppercase
		//Stream.of("Navya","Lakshya","Mini","Priti","Ashu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	//	.forEach(s->System.out.println(s));
		//print names which have first letter as a with uppercase and sorted
		
		List<String> names=Arrays.asList("Ravi","Arti","Anshul","Jhanvi");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
