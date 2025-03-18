package TestJava;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of elements in array");

		int n=scan.nextInt();
		int abc[]=new int[n]; 
		System.out.println("Enter all elements");
		for(int i=0;i<n;i++)
		{
			abc[i]= scan.nextInt();
		}
		
		int largest=abc[0];
		
		for(int i=0;i<n;i++)
		{
			if(abc[i]> largest)
			{
				largest=abc[i];
			}
		}
		
		System.out.println("The largestt number is "+largest);
	}

}
