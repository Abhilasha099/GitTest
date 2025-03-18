package TestJava;

public class JavaBasics {
	
	public static void main(String[] args) {
		
		Student stu=new Student(12,"Abhilasha",34);
		stu.display();
		stu.n();
		
	}
	

}

 class Student{

	
	int rollno;
	String Name;
	int age;
	
	void m()
	{
		System.out.println("hello m");
		
	}  
	void n(){  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}  
	
	Student(int rollno, String Name, int age)
	{
		this.rollno=rollno;
		this.Name=Name;
		this.age=age;
	}
	
	
	public void display()
	{
		
		System.out.println(rollno+" "+Name+" "+age);
		
	}
	
	

}
