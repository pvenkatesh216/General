package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class jobSitesUpdate2 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver d= new ChromeDriver();
		
		for (int i=1; i<=1; i++)
		{
			if (i==1)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
				d.get("http://www.naukti.com");
				d.findElement(By.linkText("Jobseeker Login")).click();
				d.findElement(By.id("eLogin")).sendKeys("pvenkatesh216@gmail.com");
				d.findElement(By.id("pLogin")).sendKeys("NaukriPassword_1");
				d.findElement(By.xpath("//*[@id='lgnFrm']/div[8]/button")).click();
				
			}
				
		}
			
		
		
	}
}


	