package oopsjava;

public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
		int data=50/0;//may throw an exception
		}
		catch(ArithmeticException e)//handling an exception
		{
			System.out.println(e);
		}
		System.out.println("Print rest of the code");
	}
	}
