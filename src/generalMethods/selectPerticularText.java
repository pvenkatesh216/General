package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectPerticularText {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.infor.com");
		/*WebElement s= d.findElement(By.xpath(".//*[@id='6641087']/div/div/p[1]"));
		Actions action = new Actions (d);
		action.doubleClick(s).build().perform();
		Thread.sleep(3000);
		*/
		String clr=d.findElement(By.xpath(".//*[@id='nav']/ul/li[1]/span/a")).getCssValue("color");
		String bkclr=d.findElement(By.xpath(".//*[@id='nav']/ul/li[1]/span/a")).getCssValue("background-color");
		System.out.println(clr);
		System.out.println(bkclr);
		d.quit();

	}

}
