package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class jobSitesUpdate {
	
	public static void main(String[] args) throws Exception {
		
		for (int b=1; b<=2; b++)
		{
			if(b==1)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
				WebDriver d= new ChromeDriver();
				System.out.println("Launched Chrome Browser");
				d.get("http://www.naukri.com");
				d.findElement(By.id("login_Layer")).click();
				d.findElement(By.id("eLogin")).sendKeys("pvenkatesh216@gmail.com");
				d.findElement(By.id("pLogin")).sendKeys("NaukriPassword_1");
				d.findElement(By.xpath(".//*[@id='lgnFrm']/div[8]/button")).click();
				Thread.sleep(3000);
				d.quit();
			}
			else if (b==2)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
				WebDriver d= new ChromeDriver();
				System.out.println("Launched Chrome Browser");
				d.get("http://www.timesjobs.com");
				d.findElement(By.xpath("//*[@id='site']/div[3]/header/nav[2]/ul[2]/li[1]/a")).click();
				d.switchTo().frame("//*[@id='loginbxmain']/div[2]");
				d.findElement(By.xpath("//*[@id='j_username']")).sendKeys("pvenkatesh216@gmail.com");
				d.findElement(By.id("j_password")).sendKeys("Password@1");
				d.findElement(By.xpath("//*[@id='loginForm']/ul/li[4]/input")).click();
			}
			
		   /*else if (b==3)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
				WebDriver d= new ChromeDriver();
				System.out.println("Launched Chrome Browser");
				d.get("http://www.monster.com");
				d.findElement(By.xpath(".//*[@id='jobuser_wrap']/div[1]/div/div[1]/a[1]")).click();
				d.findElement(By.id("username_login")).sendKeys("pvenkatesh216@gmail.com");
				d.findElement(By.xpath(".//*[@id='passwd_temp']")).sendKeys("Password1!");
				d.findElement(By.id("button")).click();
			}*/
		}
	}
}


	