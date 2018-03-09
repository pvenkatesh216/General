package generalMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class typecasting {

	public static void main(String[] args) throws Exception {
		
		File src= new File("D:\\Selenium\\TestData\\welcome.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheetAt(0);
		int allRows= ws.getLastRowNum();
		System.out.println("Total no.of rows="+allRows);
		for (int i=1;i<=allRows; i++)
		{
			String Age=ws.getRow(i).getCell(2).getRawValue();
			int a=Integer.parseInt(Age);
			if(a>=18)
				{
					ws.getRow(i).createCell(3).setCellValue("Yes");
					System.out.println(a+" "+"is Positive");
				}
				
				else if (a<18)
				{
					ws.getRow(i).createCell(3).setCellValue("No");
					System.out.println(a+" "+"is Negative");
				}	
			
			FileOutputStream fout= new FileOutputStream(src);
			wb.write(fout);
			wb.close();
		}
			
		
		
	}

	}