package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.gmail.com");
		//d.findElement(By.id("identifierId"));
		Actions dc= new Actions(d);
		dc.contextClick(d.findElement(By.id("identifierId"))).perform();
		Thread.sleep(3000);
		d.quit();
	}

}
