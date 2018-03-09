package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class dragnDrop {

	public static void main(String[] args) throws Exception {
		
		    System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
			WebDriver d = new FirefoxDriver();
			d.get("http://jqueryui.com/resources/demos/droppable/default.html");
			Thread.sleep(3000);
			//WebDriverWait wait = new WebDriverWait(d, 5);
			//wait.until(E)
			WebElement drag= d.findElement(By.id("draggable"));
			WebElement drop=d.findElement(By.id("droppable"));
			Actions action= new Actions(d);
			action.dragAndDrop(drag, drop).perform();
			

	}
}