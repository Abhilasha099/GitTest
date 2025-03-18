package TestJava;

import java.util.Arrays;

public class Impetus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,14,26,4,53};
//int temp=arr[0];
for(int i=0;i<arr.length;i++)//0 to 5

{
	for(int j=i+1;j<arr.length;j++)//1 to 5
	{
	if(arr[i]>arr[j])
	{
		int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
	}
	
	}

}

for(int i=0;i<arr.length;i++)
	
{
	
	System.out.println(arr[i]);
}
	}
	
	


}
