package TestJava;

public class largestnbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numbers[]= {56,88,19,8,99,145,896};
		
		for(int i=0;i<numbers.length;i++)
			
		{
			
			for(int j=i+1;j<numbers.length;j++)
				
			{
				int temp=0;
				if(numbers[i]>numbers[j])
				{
					 temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
     
		System.out.println("After sorting");
		for(int i=0;i<numbers.length;i++)
			
		{
			System.out.println(numbers[i]);
		}
	}

}
