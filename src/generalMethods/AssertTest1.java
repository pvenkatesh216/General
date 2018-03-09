package generalMethods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTest1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		WebElement Login= d.findElement(By.id("u_0_q"));
		Assert.assertTrue(Login.isDisplayed());
		System.out.println("Login button is visible");
		//System.out.println(Login.getText());
		Thread.sleep(3000);
		Login.click();
		d.quit();
		

	}

}
