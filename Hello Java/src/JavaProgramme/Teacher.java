package JavaProgramme;

public class Teacher extends School
{
public Teacher()
{
super();	
}

public Teacher(int a)
{
super(3);	
}
Teacher(int x,int y)
{
	System.out.println("Teachers count 20 ");
	}
/*Teacher(int b)
{
System.out.println("Male Teachers :12 and Female Teachers :5");	
}

WE CANNOT USE CONSTRUCTOR as Teacher()/Teacher(int x) 
coz it is already used in the same class to refer parent class constructor */

public void display()
{
System.out.println("I'm the display function from Teacher class");
}
}