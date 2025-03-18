package TestJava;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=28;
		boolean flag=false;
		for(int i=2;i<17;i++)
		{
			if(num%i==0)
				
			{
				flag=true;
				break;
			}
			

			
		}
		
		if(flag==true)
			
		{
			System.out.println("The number is not prime");
		}
		
		else
			
		{
			System.out.println("The number is prime");
	
		}

	}

}
