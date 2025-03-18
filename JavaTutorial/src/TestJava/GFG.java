package TestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG {
	
	static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        HashMap<String, Integer> temp = hm.entrySet()
        		.stream()
        		.sorted((sub, marks)-> 
            sub.getValue().compareTo(marks.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
            (e1, e2) -> e1, LinkedHashMap::new));
		return hm;

       
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = 
                new HashMap<String, Integer>();

    // enter data into hashmap
    hm.put("Math", 98);
    hm.put("Data Structure", 85);
    hm.put("Database", 91);
    hm.put("Java", 95);
    hm.put("Operating System", 79);
    hm.put("Networking", 80);
    Map<String, Integer> hm1 = sortByValue(hm);

    // print the sorted hashmap
    for (Map.Entry<String, Integer> en :
         hm1.entrySet()) {
        System.out.println(en.getKey() + ": " + en.getValue());
    }

	}

}
