package generalMethods;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertTest {
	
		
	@Test
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.facebook.com");
	

}
