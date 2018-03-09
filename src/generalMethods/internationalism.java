package generalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class internationalism {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GechoDriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		FirefoxProfile Profile= new FirefoxProfile();
		Profile.setPreference("intl.accept_languages","ar-SA");
		d.get("http://www.google.com");
		
		

	}

}
