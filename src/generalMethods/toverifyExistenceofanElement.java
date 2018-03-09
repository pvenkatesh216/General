package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class toverifyExistenceofanElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.gmail.com");
		//Thread.sleep(3000);
		WebDriverWait wait= new WebDriverWait(d,30);
		WebElement test= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Email']")));
		if (test instanceof RenderedWebElement) {
			System.out.println("Element visible");
		} else {
		System.out.println("Element Not visible");
		}
		
		d.quit();

	}

}
