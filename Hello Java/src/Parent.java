
public class Parent {

	/**
	 * WAP to demonstrate IS-A relationship in Java.

WAP with a class containing variables, methods that belong to
 public, private, protected and default. Create a child class for
 the same and print the values of parent class variables and call methods in child class.
	 */

	private String str11="I'm Private of Parent";
	public String str22="I'm Public of Parent";
	protected String str33="I'm Protected of Parent";
	String str44="I'm Default of Parnt";
	
public void publicMethod()
{
	System.out.println("Public Method is Printing");
	
}
private void privateMethod()
{
	System.out.println("Private Method is Printing");
	}
protected void protectMethod()
{
	System.out.println("Protected Method is Printing");
	}
void defaultMethod()
{
	System.out.println("Default Method is Printing");

}




}
