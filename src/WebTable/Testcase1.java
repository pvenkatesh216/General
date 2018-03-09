package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
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
		
		int enabledCount=0;
		
		for (int i=1; i<=r; i++)
		{
			String status= d.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
			
			if (status.equals("Disabled"))
			{
				enabledCount=enabledCount+1;
			}
		}
		
		System.out.println("Total no.of employees in disabled are"+enabledCount);
		d.quit();
		

	}

}
