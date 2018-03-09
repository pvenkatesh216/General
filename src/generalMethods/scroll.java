package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();

		profile.setEnableNativeEvents(true);

		WebDriver d=new FirefoxDriver(profile);

		d.get("http://jqueryui.com/draggable/");

		Thread.sleep(6000);

		WebElement element=d.findElement(By.id("draggable"));

		Actions actn=new Actions(d);

		actn.dragAndDropBy(element, 50, 50).build().perform();

		}

	}

