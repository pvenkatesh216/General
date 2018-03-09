package generalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		String text=d.getTitle();
		if(text.equals("Google123"))
		{
			System.out.println("Google Opened successfully");
		}
		else
			System.out.println("Wrong address");
		
		d.quit();

	}

}
