package TestJava;

import java.util.Scanner;

public class secondelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		// Input the size of the array 
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] array = new int[n]; 
		// Input the elements of the array 
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++)
		{
			array[i] = scanner.nextInt();
			
		} // Initialize the first and second largest to the first element
		int largest = array[0];
		int secondLargest = -1;
		// Iterate through the array to find the largest and second largest elements 
		for (int i = 1; i < n; i++)
		{
			if (array[i] > largest) 
			{
				secondLargest = largest; 
				largest = array[i];
				
			}
			else if (array[i] > secondLargest && array[i] != largest)
			{
				secondLargest = array[i];
				}
			}
		
		if (secondLargest == -1)
		
		{
			System.out.println("There is no second largest element.");
			}
		else
		{
			System.out.println("The second largest element is: " + secondLargest);
			}
		scanner.close();
	}

}
