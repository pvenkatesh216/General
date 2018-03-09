package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.infor.com");
		String bgcolor=d.findElement(By.xpath(".//*[@id='nav']/ul/li[1]/span/a")).getCssValue("background-color");
		String color=d.findElement(By.xpath(".//*[@id='nav']/ul/li[1]/span/a")).getCssValue("color");
		System.out.println(color);
		System.out.println(bgcolor);
		d.navigate()
		d.quit();
		
		

	}

}
