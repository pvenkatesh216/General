package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.findElement(By.className("gsfi")).sendKeys("cheese");
		d.findElement(By.className("gsfi")).sendKeys(Keys.ENTER);
		//d.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[5]/div/span[1]/span/input")).click();
		

	}

}
