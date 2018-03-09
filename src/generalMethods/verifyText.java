package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class verifyText {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		//WebDriver d= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		String text=d.findElement(By.id("hplogo")).getTagName();
		System.out.println(text);
		String CurURL=d.getCurrentUrl();
		System.out.println(CurURL);
		String pageSource=d.getPageSource();
		System.out.println(pageSource);
		//Assert.assertEquals("India", text);
		d.quit();

	}

}
