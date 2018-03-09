package generalMethods;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browserWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium\\ss.png"));
		d.quit();
		
		
		
		/*System.out.println(d.manage().window().getSize());
		Thread.sleep(2000);
		Dimension dm=new Dimension(420,600);
		d.manage().window().setSize(dm);
		Thread.sleep(3000);
		d.quit();
		*/
		
		/*Select  sel = new Select(d.findElement(By.id("day")));
		sel.selectByIndex(3);*/
		
		/*JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript(document.gete
		d.findElement(By.id("lst-ib")).sendKeys("test");*/
		
		/*WebDriverWait wait= new WebDriverWait(d,10);
		Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		alert.authenticateUsing(new UserAndPassword("Username", "Password"));*/
		
		
		
		
		
		
		
		
		
			

	}

}
