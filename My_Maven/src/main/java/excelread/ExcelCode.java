package excelread;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{	
	XSSFSheet sh;
	public ExcelCode() throws IOException,FileNotFoundException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Aswathi T R\\eclipse-workspace\\My_Maven\\src\\main\\resources\\Book.xlsx");
		XSSFWorkbook w =new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
				
	}
	public String readData(int row,int coloumn)
	{
		Row r=sh.getRow(row);
		Cell c=r.getCell(coloumn);
		int celltype=c.getCellType();
		
				switch(celltype)
				{
				case Cell.CELL_TYPE_NUMERIC:
				{
					double val=c.getNumericCellValue();
				return String.valueOf(val);
				}
				case Cell.CELL_TYPE_STRING:
				
				{
					return c.getStringCellValue();
				}
				}
		return null;
		
	}
}
				
		
				

