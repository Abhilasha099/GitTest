package TestJava;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,4,6,3,2,4,5,5,6,2,2};
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
			
		{
			int k=0;
			if(!a1.contains(a[i]))
				
			{
				a1.add(a[i]);
			k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						
					{
						k++;
					}
					}
				
				System.out.println(a[i]);
				System.out.println("The occruence of "+a[i]+" is "+ k);
				}
			
			
			}
		}

	}


