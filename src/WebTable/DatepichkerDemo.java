package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepichkerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.findElement(By.xpath("//*[@id="search"]/div/div[3]/div/label")).click();
		d.findElement(By.xpath("//*[@id=rb-calendar_onward_cal]/table/tbody/tr[7]/td[1]")).click();
	}

}
