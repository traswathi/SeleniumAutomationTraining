package oopsjava;

//Data members should be private.
//Functions Public.


public class EncapsulationDemo
{

	private int length;
	private int width;
	private int height;

	public void setDimention(int l,int w,int h)
	{
		System.out.println("The dimensions are ");
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
	
	}
	public int setLength(int l)
	{
		length =l;
		return length;
		
	}

	public int setWidth(int w)
	{
		width =w;
		return width;
		
	}
	public int setHeight(int h)
	{
		height =h;
		return height;
		
	}
	
	public void getLength()
	{
		System.out.println("The Length is :"+length);
	}

	public void getWidth()
	{
		System.out.println("The Length is :"+width);
	}
	public void getHeight()
	{
		System.out.println("The Length is :"+height);
	}
}
