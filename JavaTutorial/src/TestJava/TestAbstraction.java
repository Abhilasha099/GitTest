package TestJava;

public abstract class TestAbstraction {
	
	int y=3;
	public static void SMS()
	{
		System.out.println("Hello SMS");
	}
	
	public abstract void Summary();
	
	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		TestAbstraction.SMS();
		//TestAbstraction tb=new TestAbstraction();
		
	}


}
