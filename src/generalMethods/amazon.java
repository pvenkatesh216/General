package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.amazon.in");
		Select list= new Select (d.findElement(By.id("searchDropdownBox")));
		list.selectByVisibleText("Computers & Accessories");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("tabs");
		d.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		Select option= new Select (d.findElement(By.id("sort")));
		option.selectByIndex(2);
		//String s=d.findElement(By.xpath("//span[@class='currencyINR']")).getAttribute("value");
		System.out.println(s);
		d.quit();
	}

}
