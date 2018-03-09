package generalMethods;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AssertNew {
  @SuppressWarnings("deprecation")
@Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.facebook.com");
		String test=d.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).getText();
		Assert.assertEquals(test, "facebook");
		
  }
}
