// Declare the interfaces 
interface Walkable { 
	void walk(); 
} 

interface Swimmable { 
	void swim(); 
} 

// Implement the interfaces in a class 
class Duck implements Walkable, Swimmable 
{
	public void walk() 
	{ 
		System.out.println("Duck is walking."); 
	} 

	public void swim() 
	{ 
		System.out.println("Duck is swimming."); 
	} 
}

// Use the class to call the methods from the interfaces 
public class Interface
{ 
	public static void main(String[] args) 
	{ 
		Duck duck = new Duck(); 
		duck.walk(); 
		duck.swim(); 
	} 
}