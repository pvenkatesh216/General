package generalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MB {
	public static WebDriver d;

	public static void main(String[] args) {
		
		
		for (int b=1; b<=3; b++)
		{
			if(b==1)
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
				d= new ChromeDriver();
				System.out.println("Launched Chrome Browser");
			}
			else if (b==2)
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
				d= new FirefoxDriver();
				System.out.println("Launched Firefox Browser");
			}
			else if (b==3)
			{
				System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IE Driver\\IEDriverServer.exe");
				d= new InternetExplorerDriver();
				System.out.println("Launched IE Browser");
			}
			d.get("http://www.infor.com");
			System.out.println(d.getTitle());
			d.quit();
			
		}

	}

}
