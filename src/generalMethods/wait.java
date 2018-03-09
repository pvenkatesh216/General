package generalMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(test, TimeUnit.WEEKS);
		

	}

}
