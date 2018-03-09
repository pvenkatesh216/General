package generalMethods;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allvaluesfromdd_Delete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
	    java.util.List<WebElement> allLinks=d.findElements(By.tagName("a"));
	    int count=allLinks.size();
	    System.out.println(count);
	    for (int i=0; i<count; i++)
	    {
	    	System.out.println(allLinks.get(i).getText());
	    }
	    
	    
				

	}

}

