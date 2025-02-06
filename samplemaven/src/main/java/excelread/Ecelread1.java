package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ecelread1 
{
 static FileInputStream f;
 static XSSFWorkbook w;
 static XSSFSheet s;
 public static String getStringdata(int a,int b) throws IOException
 {
 	f=new FileInputStream("C:\\Users\\Smrithy\\Desktop\\java programs\\Book1.xlsx");
 	w=new XSSFWorkbook(f);
 	s=w.getSheet("Sheet1");
 	XSSFRow r=s.getRow(a);
 	XSSFCell c=r.getCell(b);
 	return c.getStringCellValue();//string data ne get cheyanulla inbult method getStringCellValue();
 	
 }
 public static String getIntegerdata(int a,int b) throws IOException
 {
 	f=new FileInputStream("C:\\Users\\Smrithy\\Desktop\\java programs\\Book1.xlsx");
 	w=new XSSFWorkbook(f);
 	s=w.getSheet("Sheet1");
 	XSSFRow r=s.getRow(a);
 	XSSFCell c=r.getCell(b);
 	int y=(int) c.getNumericCellValue();
 	return String.valueOf(y);
 	
 }

 }


