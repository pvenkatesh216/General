package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allValuesfromDropdownlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		Select Days= new Select(d.findElement(By.id("day")));
		List <WebElement> list= Days.getOptions();
		int i= list.size();
		System.out.println("Toral values are" + i);
		for (int x=0; x<i; x++)
		{
			System.out.println(list.get(x).getText());
		}
		
	}

}

