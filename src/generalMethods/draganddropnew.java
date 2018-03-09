package generalMethods;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropnew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		WebElement src=d.findElement(By.id("gb_70"));
		WebElement dest=d.findElement(By.id("gs_htif0"));
		Actions dd= new Actions(d);
		//Actions dnd=dd.clickAndHold(src).moveToElement(dest).perform();
		dd.dragAndDrop(src, dest).perform();
		Thread.sleep(2000);
		

	}

}
