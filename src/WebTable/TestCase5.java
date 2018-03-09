package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://webdatacommons.org/webtables/");
		int r=d.findElements(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr")).size();
		System.out.println("Total No.of Rows="+r);
		int c= d.findElements(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr/th")).size();
		System.out.println("Total No.of Cols="+c);
		for (int i=2;i<=r; i++)
		{
			for (int j=1; j<=c;j++)
			{
				System.out.println(d.findElement(By.xpath("html/body/div[5]/div[2]/table[1]/tbody/tr["+i+"]/td["+j+"]")).getText());
				
			}
			System.out.println();
		}
		
		
		
		/*String s=d.findElement(By.xpath(".//*[@id='toccontent']/table[1]/tbody/tr[3]/td[2]")).getText();
		System.out.println(s);
		Thread.sleep(3000);*/
		d.quit();

	}

}
