package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findAllFramesofapage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.w3schools.com");
		List<WebElement> allFrames= d.findElements(By.tagName("iframe"));
		System.out.println("Total no.of frames are"+" "+allFrames.size());
		d.quit();
		

	}

}
