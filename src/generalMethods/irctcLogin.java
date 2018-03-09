package generalMethods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctcLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.irctc.co.in");
		d.findElement(By.id("usernameId")).sendKeys("zphsgpt");
		d.findElement(By.name("j_password")).sendKeys("gptzphs");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Captcha");
		String Captcha=scan.nextLine();
		d.findElement(By.className("loginCaptcha")).sendKeys(Captcha);
		d.findElement(By.id("loginbutton")).click();
		

	}

}
