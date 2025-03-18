package TestJava;

import java.util.Scanner;

public class FindingPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
        int n=100;
        System.out.println("Prime numbers between 1 to "+n+" are ");
for(int j=2;j<=n;j++)
{
	
count=0;

for(int i=1;i<=j;i++)
{
if(j%i==0)
{
     count++;        
}
}

if(count==2)
    System.out.print(j+"  ");     
}
	}

}
