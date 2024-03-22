package Parametters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priorityy {
	WebDriver driver;
	
	@Test (priority=1)
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail");
	}
	
	@Test (priority=2)
	public void lauchGoogle() {
		driver.get("http://www.google.co.in");
	}
	
	@Test (priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com/");
	}
	

}
