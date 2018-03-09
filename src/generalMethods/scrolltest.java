package generalMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class scrolltest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript(windo)
		
		
		
//		Robot rb= new Robot();
//		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rb.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}

}
