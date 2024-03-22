package Parametters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Chaitulogin{

	WebDriver driver;
	@Test(retryAnalyzer = Retry.class)
	public void HotelP() {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("chaithuuu");
		driver.findElement(By.id("password")).sendKeys("123455");
		driver.findElement(By.id("login")).click();
		Assert.assertEquals(false, null);
	}
}