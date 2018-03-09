package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class editings {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
	    Thread.sleep(3000);
		String s=d.findElement(By.linkText("Gmail")).getCssValue("font-size");
		System.out.println("Font Size is "+""+s);
		String s1=d.findElement(By.linkText("Gmail")).getCssValue("color");
		System.out.println("Font Color is "+""+s1);
		String s2=d.findElement(By.linkText("Gmail")).getCssValue("font-weight");
		System.out.println("font-weight is "+""+s2);
		String s3=d.findElement(By.linkText("Gmail")).getCssValue("background-color");
		System.out.println("Background color is "+""+s3);
		d.quit();
		

	}

}
