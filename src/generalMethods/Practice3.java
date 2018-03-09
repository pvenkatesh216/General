package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://automationpractice.com/");
		d.findElement(By.id("search_query_top")).sendKeys("dresses for kids");
		d.findElement(By.name("submit_search")).click();
		Thread.sleep(3000);
		String text=d.findElement(By.xpath("//*[@id='center_column']/h1/span")).getText();
		System.out.println(text);
		String value[]= new String[5];
		value[]=text.split(regex)
		
		
		//text.spli
		d.quit();
		

	}

}
