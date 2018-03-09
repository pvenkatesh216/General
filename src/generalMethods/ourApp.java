package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ourApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://mingletrial07-portal.mingledev.infor.com/integration_tst/");
		d.findElement(By.className("authenticaion-box")).click();
		d.findElement(By.id("name")).sendKeys("qa.ion1@protonmail.com");
		d.findElement(By.id("password")).sendKeys("Password1!");
		d.findElement(By.id("submit")).click();
		WebDriverWait wait= new WebDriverWait(d,50);
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath(".//*[@id='container']/div[2]/a[1]/div"))));
		d.findElement(By.xpath(".//*[@id='container']/div[2]/a[1]/div")).click();
		d.findElement(By.xpath(".//*[@id='83902331-54da-46cf-a56a-d9fe0662aa25-menu']/a")).click();
		
		
		

	}

}
