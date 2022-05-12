package JavaProgramme;

//Hierarchical  Inheritance
public class Hyundai extends Car{

	
	public void view()
	{
	System.out.println("I'm from Hyundai");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hyundai is the Grand child of Vehicle class and sub class of Car");
	Hyundai obj=new Hyundai();
	obj.view();
	obj.display();
	obj.show();
	}

}
