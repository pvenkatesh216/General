package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://inhyvwmingledev.infor.com:1443/infor/2f713768-715b-494e-9e01-bc42493695a3?favoriteContext=%7B%22type%22%3A%22page%22%2C%22id%22%3A%2285954ef3-1b4a-4a4b-8619-6b459071005f%22%7D&LogicalId=lid://infor.homepages.1");
		d.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys("jbalagonda@infor.com");
		d.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("Jyothi@4321");
		d.findElement(By.xpath(".//*[@id='submitButton']")).click();
		Thread.sleep(10000);
		for (int i=1; i<=1000; i++)
		{
			d.navigate().refresh();
			Thread.sleep(10000);
		}
		
		}

}
