package generalMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countofUnreadMails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.gmail.com");
		d.findElement(By.id("Email")).sendKeys("pvenkatesh216");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.findElement(By.id("next")).click();
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.findElement(By.id("Passwd")).sendKeys("SANDHYARANI");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.findElement(By.id("signIn")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//a[contains(@href, 'https://mail.google.com/mail/u/0/#drafts')]")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text=d.findElement(By.xpath("//a[contains(@href, 'https://mail.google.com/mail/u/0/#drafts')]")).getText();
		String DraftsCount=text.substring(text.indexOf("(")+1,text.indexOf(")"));
		System.out.println("Total No.of mails in Draft are"+" " +DraftsCount);
		
		String text1=d.findElement(By.xpath("//a[contains(@href, 'https://mail.google.com/mail/u/0/#inbox')]")).getText();
		String InboxCount=text1.substring(text1.indexOf("(")+1,text.indexOf(")"));
		System.out.println("Total No.of mails in Inbox are"+" " +InboxCount);
		d.quit();

	}

}
