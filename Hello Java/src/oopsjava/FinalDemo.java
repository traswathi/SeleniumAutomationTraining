/*WAP to create a class FinalDemo.Use final keyword along  with a variable,
 method and class and understand the working.*/

package oopsjava;

public class FinalDemo
{

	final int number = 10;    //final variable
	//final float value;                                       //blank final variable
	static final double rate = 2.5;             //final and static variable
	
	  //declaring and initializing a final variable
	  final int speedlimit = 60;
	  void controlSpeed() {
	    //Trying to change the value of the final variable will give an error
	    speedlimit = 150;
	  }
	public static void main(String[] args) 
	{
		FinalDemo obj=new FinalDemo();
		obj.controlSpeed();

	}

}
