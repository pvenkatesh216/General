package generalMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	public static WebDriver d;

	public static void main(String[] args) throws Exception {
		File src= new File("D:\\Selenium\\TestData\\readData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheetAt(0);
		int rowcount= ws.getLastRowNum();
		System.out.println(rowcount);
		
		for (int i=1;i<rowcount; i++)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
			d= new ChromeDriver();
			d.get("http://www.gmail.com");
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			d.findElement(By.id("identifierId")).sendKeys(username);
			d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			String passwd=ws.getRow(i).getCell(1).getStringCellValue();
			d.findElement(By.name("password")).sendKeys(passwd);
			d.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
			Thread.sleep(3000);
			d.quit();
			}
		}

}


File src= new File ("Path");
FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb= new XSSFWorkbook(fis);
XSSFSheet ws= wb.getSheetAt(0);
int rowcount= ws.getLastRowNum();

For (int i=0; i<rowcount; i++)
{
	
	String username= ws.getRow(i).getCell(0).getStringCellValue();
	d.findElement(arg0)
	
}


