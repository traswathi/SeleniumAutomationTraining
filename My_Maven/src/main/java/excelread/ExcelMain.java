package excelread;
import java.io.IOException;
import java.io.FileNotFoundException;


public class ExcelMain
{
public static void main(String[] args)throws IOException,FileNotFoundException
{
	ExcelCode obj=new ExcelCode();
	String str=obj.readData(0,0);
	System.out.println(str);
	String str1=obj.readData(0,1);
	System.out.println(str1);
	String str2=obj.readData(0,2);
	System.out.println(str2);
	System.out.println();
	String str3=obj.readData(1,0);
	System.out.println(str3);
	String str4=obj.readData(1,1);
	System.out.println(str4);
	String str5=obj.readData(1,2);
	System.out.println(str5);
	}
}
