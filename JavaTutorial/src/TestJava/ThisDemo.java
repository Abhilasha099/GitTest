package TestJava;

public class ThisDemo {
	
	int a=2;
	public  void getData()
	{
		int a=3;
		//this.a=a;
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		
		ThisDemo dd= new ThisDemo();
		dd.getData();
		

	}

}
