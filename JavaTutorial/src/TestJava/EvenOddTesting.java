package TestJava;

public class EvenOddTesting {

	public static void main(String[] args) {
		  
		
		int[] myarray={5,3,7,2,6,11,22,9};
	    
	    System.out.println("Array Elements...");
	    
	    for(int i=0;i<myarray.length;i++)
	    {
		System.out.println(myarray[i]);
            }
	    
	    int[] tarr=new int[myarray.length];
	   
	    int j=0;
	    
	    for(int i=0;i<myarray.length;i++)
	    {   
		
	    	int x=myarray[i]; // 1st loop x=5 
		 
	    	if(x%2==0)
		{
			tarr[j]=x;//tarr[]=2,6,22 j=3
			//System.out.println(tarr[j]);
			j++;
		}
	    	
	    	
            }
	    
	   
	    for(int i=0;i<j;i++)
	    {
		System.out.println(tarr[i]);
           
	    }
	    
	    
	    
	    
	    
	    System.out.println("Value of j"+j);
	    for(int i=0;i<myarray.length;i++)
	    {   
		int x=myarray[i];
		if(x%2==1)
		{
			tarr[j]=x; //tarr[]=5,3,7,11,9    j=8
			j++;
		}
            }
	    System.out.println("\nArray Elements After Aranging Even and Odd Numbers...");
	    for(int i=0;i<tarr.length;i++)
	    {
		System.out.println(tarr[i]);
            }	
	        	
	      
	}

}
