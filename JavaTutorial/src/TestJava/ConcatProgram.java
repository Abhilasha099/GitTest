package TestJava;

public class ConcatProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first="Abhilasha";
		String last="Gupta";
		
		System.out.println(first.concat(" "+last));
		
		//comparing to strings
		
		if(first.equalsIgnoreCase(last))
		{
			
			System.out.println("Both strings are same");
		}

		else
		{
			System.out.println("Not same");		
		}
		
		
	}

}
