package generalMethods;

import java.io.File;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventFiring {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.gmail.com");
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(browser).register(new AbstractWebDriverEventListener() {

		  @Override
		  public void onException(Throwable throwable, WebDriver browser) {

		    // Take the screenshot using the Webdriver.
		    File screen = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

		    // Now you can copy the screenshot somewhere on your system.
		    FileUtils.copyFile(screen, new File("c:\\Selenium Testing Questions\\screen.png"));
		  }
		});

		try {

		  eventDriver.findElement(By.id("test"));
		  fail("Caught the Expected exception."); // Intentionally causing the exception for demo.

		} catch (NoSuchElementException e) {

		  // Triggering point for the <onException> event.
		}
			
		
		
		
		

	}

}
