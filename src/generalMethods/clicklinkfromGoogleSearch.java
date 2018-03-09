package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clicklinkfromGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.findElement(By.id("gs_htif0")).sendKeys("venkatesh");
		d.findElement(By.id("_fZl")).click();
		d.quit();

	}

}
