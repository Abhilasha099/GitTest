package TestJava;

public class JavaBasicsTest extends abc {

	public static void main(String[] args) {
	
		abc cc=new JavaBasicsTest();
		cc.getName();


	}
	
	@Override
	public void getName()
	{
		System.out.println("I am getName method of java basic test class");
	}
	
}




class abc
{
	abc()
	{
		System.out.println("I am abc default constructor");
	}
	
	public void getName()
	{
		System.out.println("I am getName method of parent class");
	}
	
	
}
