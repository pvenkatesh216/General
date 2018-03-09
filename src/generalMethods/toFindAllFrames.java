package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class toFindAllFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.microsoft.com");
		List<WebElement> AllFrames= d.findElements(By.tagName("iframe"));
		System.out.println("Total no.of frames="+ AllFrames.size());
		d.quit();

	}

}
