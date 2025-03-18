package TestJava;

public class CountstringOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=countOccurences("assaassad",'a');
		System.out.println("The count of a is "+count);

	}
	
	public static int countOccurences(String name, char numChar)
	
	{
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==numChar)
			{
				count++;
			}
		}
		return count;
		
	}

}
