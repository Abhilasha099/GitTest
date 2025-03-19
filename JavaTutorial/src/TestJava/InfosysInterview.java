package TestJava;

public class InfosysInterview extends TestAbstraction{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Air a=new Air();
		
		InfosysInterview ii=new InfosysInterview();
		ii.Summary();

	}

	@Override
	public void Summary() {
		
		System.out.println("This is abstract class method");
		System.out.println("this are my changes on 19th of march");
		
	}

}

class Air
{

	public Air()
	{
	int x=50;
	System.out.println("value of x "+x);
	}
	

}



