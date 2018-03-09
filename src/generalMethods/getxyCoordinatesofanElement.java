package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getxyCoordinatesofanElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/gmail/about/");
		Point p=d.findElement(By.xpath("html/body/nav/div/a[2]")).getLocation();
		System.out.println(p);
		int x=p.getX();
		int y= p.getY();
		System.out.println("X-Coordinate is"+" "+x);
		System.out.println("Y-Coordinate is"+" "+y);
		d.quit();
		

	}

}
