package oopsjava;

public abstract class AbstractionDemo 
{
public abstract void drawShape();
public abstract void moveShape();
public abstract void colourShape();
public void describeShape()
{
System.out.println("Describe Shape");	
}


}

/* in abstract class we can have both abstract methods and concreate(instance)method.
 * if only abstract methods are persent then 100% data hiding is possible .
 * depending on other instance methods added to abstract class,0-100% data hiding can be acheived*/

