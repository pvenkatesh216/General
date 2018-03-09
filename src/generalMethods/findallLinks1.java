package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findallLinks1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.gmail.com");
		List<WebElement> links=d.findElements(By.tagName("a"));
		int totallinks= links.size();
		for (int i=0; i<=totallinks;i++)
		{
			System.out.println(links.get(i).getText());
		}
		d.quit();
			
	}

}
