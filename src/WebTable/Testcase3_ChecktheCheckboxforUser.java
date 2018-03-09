package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3_ChecktheCheckboxforUser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com");
		d.findElement(By.name("txtUsername")).sendKeys("Admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Actions action= new Actions(d);
		action.moveToElement(d.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();
		action.moveToElement(d.findElement(By.id("menu_admin_UserManagement"))).build().perform();
		d.findElement(By.id("menu_admin_viewSystemUsers")).click();
		Thread.sleep(3000);
		
		int r=d.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		System.out.println("Total no.of rows="+r);
		
		int names=0;
		
		for (int i=1; i<=r; i++)
		{
			String name= d.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[4]")).getText();
			
			System.out.println(name);
			if (name.equals("John Smith"))
			{
				names=names+1;
				System.out.println("Number of matching results="+names);
				d.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[1]")).click();
			}
		}
		d.quit();

	}

}
