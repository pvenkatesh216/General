package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.google.com");
		d.findElement(By.id("gs_htif0")).sendKeys("venkatesh", Keys.ENTER);

	}

}
