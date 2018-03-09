package generalMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://automationpractice.com/");
		String s=d.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/span/strong")).getText();
		System.out.println(s);
		//d.findElement(By.id("search_query_top")).sendKeys("dresses");
		//d.findElement(By.name("submit_search")).click();
		//WebElement x=d.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a"));
		//Actions act= new Actions(d);
		//act.moveToElement(x).build().perform();
		//Thread.sleep(3000);
		//d.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
		//Thread.sleep(3000);
		d.quit();
		

	}

}
