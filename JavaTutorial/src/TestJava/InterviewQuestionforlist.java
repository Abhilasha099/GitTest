package TestJava;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestionforlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "abc12def34gh56ijkl78mn90";
	       
		 List<String> pairs = findConsecutiveNumberPairs(input);
		        System.out.println("Pairs of consecutive numbers:");
		        for (String pair : pairs) {
		            System.out.println(pair);
		        }

		
		
		
	}
	
	 public static List<String> findConsecutiveNumberPairs(String input) {
	        List<String> pairs = new ArrayList<>();
	        for (int i = 0; i < input.length() - 1; i++) {
	            if (Character.isDigit(input.charAt(i)) && Character.isDigit(input.charAt(i + 1))) {
	                pairs.add(""+input.charAt(i) + input.charAt(i + 1));
	            }
	        }
	        return pairs;
	    }


}
