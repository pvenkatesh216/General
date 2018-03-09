package generalMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.amazon.in");
		Select value= new Select(d.findElement(By.id("searchDropdownBox")));
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		value.selectByIndex(1);
	    //value.selectByVisibleText("Automotive Parts & Accessories");
	    d.quit();
		

	}

}
