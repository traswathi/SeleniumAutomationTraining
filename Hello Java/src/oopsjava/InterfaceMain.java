package oopsjava;

public class InterfaceMain {


	public static void main(String[] args)
	{
		InterfaceDemo obj=new InterfaceRectangle();
		obj.drawShape();
		obj.colourShape();
		obj.moveShape();
		InterfaceDemo obj1=new InterfaceCircle();
		obj1.drawShape();
		obj1.moveShape();
		obj1.colourShape();
		

	}

}
