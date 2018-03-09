package generalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class handleHttps {

	public static void main(String[] args) {
		
		FirefoxProfile profile= new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);
		WebDriver d= new FirefoxDriver (profile);
	
		

	}

}
