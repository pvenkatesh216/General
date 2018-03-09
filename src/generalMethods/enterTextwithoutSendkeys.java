package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class enterTextwithoutSendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.gmail.com");
		d.findElement(By.id("Email")).sendKeys("pvenkatesh216");
		String text= d.findElement(By.id("Email")).getAttribute("value");
		System.out.println(text);
		
		JavaScriptExecutor js=(JavaScriptExecutor)d;
		js.executeScript(document.)
		
		
		int width=d.findElement(By.id("Email")).getSize().getWidth();
		System.out.println("Width of the username textbox is"+" "+ width);
		int height = d.findElement(By.id("Email")).getSize().getHeight();
		System.out.println("Height of the username textbox is"+" "+ height);
		
		d.quit();
		
		
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visi
				
				d.manage().window().setSize(new Dimension(500,500);
				
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile test= pr.getProfile(arg0);
		
		WebElement src="D\test";
		WebElement target= "E\user";
		
		
		Actions action= new Actions(d);
		action.dragAndDrop(src, target);
		
		
		
		
				
		

	}

}
