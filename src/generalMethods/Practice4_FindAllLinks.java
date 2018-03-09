package generalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_FindAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//d.manage().window().maximize();
		d.get("http://automationpractice.com/index.php");
		List<WebElement> list=d.findElements(By.tagName("a"));
		int s=list.size();
		System.out.println("Total no.of links"+"="+s);
				
		for (int i=0; i<s;i++)
		{
		     String vals=list.get(i).getText();
		     System.out.println(vals);
		     //list.get(i).click();
		     //d.navigate().back();
		}
		d.quit();
		

	}

}
