package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberofFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.amazon.in");
		List<WebElement> framesize=d.findElements(By.tagName("iframe"));
		int c= framesize.size();
		System.out.println("no.of frames="+c);
		d.quit();
		

	}

}
