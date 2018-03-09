package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearOverwrite {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http:www.gmail.com");
		WebElement enter=d.findElement(By.id("Email"));
		enter.sendKeys("test");
		Thread.sleep(3000);
		enter.clear();
		Thread.sleep(3000);
		enter.sendKeys("new value");
		Thread.sleep(3000);
		d.quit();
		

	}

}
