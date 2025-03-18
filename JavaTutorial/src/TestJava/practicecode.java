package TestJava;

import java.util.Arrays;

public class practicecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]= {23,65,11,23,11};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]==arr[i+1])
			
		{
			System.out.println("Duplicates "+arr[i]);
		}

		}
	}

}
