package TestJava;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog(); // Create a Dog object
        myDog.makeSound(); 
      
	}

}

class Animal {
    // Method to be overridden
	
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
}
    
    class Dog extends Animal {
        // Overriding the makeSound method
       @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }




