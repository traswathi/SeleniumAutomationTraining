package oopsjava;

public interface InterfaceDemo {

	int A=10; //public static final int A=10
	public  void drawShape();//public abstract void drawshape
	public  void moveShape();
	public  void colourShape();
}
/*cannot use concrete/instance methods
 * by default interface can take only abstract methods and static final variables.
 * hence we need not explicitly specify abstract/final int
 * when writing methods /variables respectively in interface also no concrete/instance method*/

