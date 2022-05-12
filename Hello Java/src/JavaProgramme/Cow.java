package JavaProgramme;

public class Cow extends Animal {

	String name="I'm a Cow";
	int leg=2;
	
	public void display()
	{
		System.out.println("I am Domestic Animal");
	}
	public void printMessage()//super cannot directly use in main function
	{
		System.out.println("Variable from Child Class without 'Super'");
		System.out.println(name);
		System.out.println("My Legs are "+leg);
		
		System.out.println("Functon from Child Class without 'Super'");
		display();
		
		System.out.println("Variable from Parent Class using 'Super'");
		System.out.println(super.name);
		System.out.println("My Legs are "+super.leg);
		
		System.out.println("Functon from Parent Class using 'Super'");
		super.display();
	
		
	}

}
