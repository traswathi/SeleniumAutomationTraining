package oopsjava;

public class EncapsMain {

	public static void main(String[] args)
	{
		EncapsulationDemo obj =new EncapsulationDemo();
		
		int l=obj.setLength(10);
		obj.getLength();
		
		int h=obj.setHeight(5);
		obj.getHeight();
		
		int w=obj.setWidth(5);
		obj.getWidth();
		
		obj.setDimention(l, w, h);

	}

}
/* we are passing value for private variable in this class(EncapMain) as argmnts /parameters
in EncapsulationcClass using the setter method we are assigning values for variables using parameters passed from EncapMain
Since the members are private in class encapsulation the only wy to access them is through the public methods of encapsu;ation class*/
