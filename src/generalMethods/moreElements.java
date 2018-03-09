package generalMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class moreElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> elements = d.findElements(By.className("tsf-p"));
		int size= elements.size();
		for (int i=0; i<=size; i++)
		{
			String s=elements.get(i).getText();
			System.out.println(s);
		}
		d.quit();

	}

}
