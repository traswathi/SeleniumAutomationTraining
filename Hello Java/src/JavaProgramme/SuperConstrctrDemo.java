package JavaProgramme;

public class SuperConstrctrDemo {

	
	public static void main(String[] args) {
		Teacher obj=new Teacher();
		Teacher obj1=new Teacher(1);
		Teacher obj2=new Teacher(1,2);//here it calls a default constructor of the Teacher class
		// so that Teacher() executes once more
		obj.display();

	}

}
