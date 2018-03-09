package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://webdatacommons.org/webtables/");
		int r=d.findElements(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr")).size();
		System.out.println("number of rows="+r);
		int c=d.findElements(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr/th")).size();
		System.out.println("number of Cols="+c);
		
		for (int i=1; i<=r; i++)
		{
			for (int j=1; j<=c; j++)
			{
				System.out.println(d.findElement(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr["+i+"]/th["+j+"]")).getText());
			}
			System.out.println();
		}
		d.quit();
		
		

	}

}
