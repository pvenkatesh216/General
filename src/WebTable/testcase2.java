package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testcase2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com");
		d.findElement(By.name("txtUsername")).sendKeys("Admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Actions action= new Actions(d);
		action.moveToElement(d.findElement(By.id("menu_pim_viewPimModule"))).build().perform();
		d.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		int allUsers=d.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr")).size();
		System.out.println("Total no.of employees="+allUsers);
		int allColumns=d.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th")).size();
		System.out.println("Total no.of Columns="+allColumns);
		
		for (int i=1; i<=allUsers; i++)
		{
			for (int j=1; j<=allColumns; j++)
			{
				System.out.println(d.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
		d.quit();

	}

}
