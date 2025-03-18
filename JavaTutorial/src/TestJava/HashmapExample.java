package TestJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm= new HashMap<Integer,String>();
hm.put(1, "Hello");
hm.put(2, "GoodBye");
hm.put(34, "Tata");
System.out.println(hm.get(2));

Set st=hm.entrySet();

Iterator it=st.iterator();

while(it.hasNext())
{
	
	Map.Entry mp= (Map.Entry)it.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
	}


	}

}
