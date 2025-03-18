 package TestJava;

public class ReverseName {

	public static void main(String[] args) {
		
		int orignum=678;
		int revnum=0;;
		int num=0;
		
		while(orignum>0)
		{
			num=orignum%10;
			revnum=num+revnum*10;
			orignum=orignum/10;
			
			
		}
		
		System.out.println(revnum);
		// TODO Auto-generated method stub

	}

}
