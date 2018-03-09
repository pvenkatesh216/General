package generalMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://automationpractice.com/");
		//d.findElement(By.linkText("http://automationpractice.com/index.php?controller=contact")).click();
		d.findElement(By.xpath(".//*[@id='contact-link']/a")).click();
		Thread.sleep(3000);
		Select value= new Select(d.findElement(By.id("id_contact")));
		Thread.sleep(3000);
		value.selectByIndex(1);
	    d.findElement(By.id("email")).sendKeys("123@gmail.com");
	    d.findElement(By.id("id_order")).sendKeys("testing");
	    d.findElement(By.id("fileUpload")).click();
	    Thread.sleep(3000);
		d.quit();
	
	}

}
