
public class Child extends Parent 
{
	private String str1="I'm Private of child";
	public String str2="I'm Public of child";
	public String str7="I'm Public of child";
	protected String str3="I'm Protected of child";
	String str4="I'm Default of child";
	public static void main(String[] args)
	{
	Child obj=	new Child();
	
	System.out.println(obj.str1);
	System.out.println(obj.str2);
	System.out.println(obj.str3);
	System.out.println(obj.str4);
	
	
	//System.out.println(obj.str11);
	System.out.println(obj.str22);
	System.out.println(obj.str33);
	System.out.println(obj.str44);
	
	obj.publicMethod();
	//obj.privateMethod();
	obj.protectMethod();
	obj.defaultMethod();

	}

}
