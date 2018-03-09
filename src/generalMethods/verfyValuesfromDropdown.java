package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class verfyValuesfromDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		String arr[]= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		
		d.get("http://www.facebook.com");
		Select select= new Select(d.findElement(By.id("month")));
		List<WebElement> li= select.getOptions();
		int v= li.size();
		System.out.println("Total values are"+" "+v);
		
		for (int i=0;i<v;i++)
		{
			Assert.assertEquals(arr[i], li.get(i).getText());
		}
	
        System.out.println("Assertion seccuessful");
        d.quit();
	}

}
