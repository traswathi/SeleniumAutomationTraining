/*WAP to create a class StringBuilderDemo and assign the value "This is StringBuilder"
 *  to a variable and perform the following operations on the same and print the value 
 *  of the variable each time you perform an operation.
append()
insert()
replace()
delete()

*/


package oopsjava;

public class StringBuilderDemo 
{
	public static void main(String[] args)
	{
		StringBuilder obj=new StringBuilder("This is StringBuilder ");
		obj.append("of StringBuilderDemo class");//appending a charecter
		System.out.println(obj);
		obj.insert(3, "---inserted---");
		System.out.println(obj);
		obj.replace(0,3,"--Replace--");
		System.out.println(obj);
		obj.delete(4, 10);

	}

}
