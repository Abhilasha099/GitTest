package TestJava;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Abhilasha";
	char[] ch= str.toCharArray();
	int count=0;
	for(char c : ch)
	{
count++;
	}
	
	System.out.println("The length is "+count);
	
	int length=str.length();
	System.out.println(length);
	}
	
	
	
}
