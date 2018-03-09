package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeHeightnWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/gmail/about/");
		Dimension value=d.findElement(By.xpath("html/body/nav/div/a[2]")).getSize();
		System.out.println("Size="+value);
		System.out.println(value.getHeight());
		System.out.println(value.getWidth());
		d.quit();

	}

}
