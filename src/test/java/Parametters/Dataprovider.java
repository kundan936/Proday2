package Parametters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	@Test (dataProvider="testsdata")
	
	public void Program(String username, String password) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	@DataProvider(name="testsdata")
	public Object[][] getdata() {
		Object[][] data = new Object[6][2];
		data [0][0] = "vasuvespag";
		data [0][1] = "vasu1234";
		data [1][0] = "Sriyaseth";
		data [1][1] = "Sriya@86";
		data [2][0] = "Varsharaj";
		data [2][1] = "Varsharaj";
		data [3][0] = "jastisrija";
		data [3][1] = "OY38RV";
		data [4][0] = "chaithuu";
		data [4][1] = "12309876";
		data [5][0] = "34567";
		data [5][1] = "098765";
 		return data;
	}
}
