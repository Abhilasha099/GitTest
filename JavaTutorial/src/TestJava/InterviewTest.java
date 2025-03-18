package TestJava;

import java.util.ArrayList;

public class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {6,4,5,1,9};
		int b[]= {5,4,7,1,9};
		 ArrayList arr= new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				
				arr.add(a[i]);
			}
		}
		
		//Object abc=arr.toArray();
		
		
		for(Object q : arr)
		{
			System.out.println(q);
		}
		
	}

	
}
