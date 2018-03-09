package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/vpadigela/Desktop/webpage/webtable.html");
		int r=d.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("Toral no.of rows="+r);
		
		int c=d.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		System.out.println("Toral no.of columns="+c);
		
		for (int i=2;i<=r;i++)
		{
			for (int j=1;j<=c; j++)
			{
				System.out.println(d.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				
			}
			System.out.println();
		}
		
		
		d.quit();
 }

}
