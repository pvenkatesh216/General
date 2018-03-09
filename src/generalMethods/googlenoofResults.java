package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlenoofResults {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://www.google.com");
		d.findElement(By.className("gsfi")).sendKeys("cheese");
		d.findElement(By.className("sbico-c")).click();
		WebElement myDynamicElement = (new WebDriverWait(d, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    List<WebElement> AllLinks = d.findElements(By.xpath("//*[@id='rso']//h3/a"));
	    int x= AllLinks.size();
	    
	    System.out.println("Total no .of resuts are"+" "+x);
		
		 for (WebElement webElement : AllLinks)
		    {
		        System.out.println(webElement.getAttribute("href"));
		    }	
		 
		 String third_link = AllLinks.get(2).getAttribute("href");
		    d.navigate().to(third_link);
		    Thread.sleep(4000);;
		 d.quit();

		
}

}
