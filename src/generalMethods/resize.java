package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 400, 200).perform();

	}

}
