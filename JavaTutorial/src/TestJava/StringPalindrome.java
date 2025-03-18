package TestJava;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc= "Shivansh";
		String rev= "";
		int length= abc.length();
		System.out.println("number of characters "+length);
		for(int i=length-1;i>=0;i--)
		{
			rev+=abc.charAt(i);
		}
		
System.out.println(rev);
	
	}

}
