package TestJava;

import java.util.HashSet;
import java.util.Iterator;

public class PracticeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("Vanilla");
		hs.add("Stwarbeery");
		hs.add("Grapes");
	int count=0;
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			count++;
			System.out.println(i.next());
		}
		
		hs.remove("Vanilla");
		System.out.println(count);
		boolean b=hs.contains("Grapes");
		System.out.println(b);
		System.out.println(hs.size());
	}

}
