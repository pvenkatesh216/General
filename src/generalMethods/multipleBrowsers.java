package generalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multipleBrowsers {
	
	public static WebDriver d;

	public static void main(String[] args) {
		
		for (int browser=1; browser<=3; browser++)
		{
			if (browser==3)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
				d= new ChromeDriver();
				System.out.println("Launched Chrome Browser");
				
			}
			else if (browser==2)
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
				d= new FirefoxDriver();
				System.out.println("Launched Firefox Browser");
			}
			else if (browser==1)
			{
				System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IE Driver\\IEDriverServer.exe");
				d= new InternetExplorerDriver();
				System.out.println("Launched IE Browser");
			}
			d.get("http://www.infor.com");
			String title=d.getTitle();
			System.out.println(title);
			d.quit();
			
			
		}
		
		

	}

}
