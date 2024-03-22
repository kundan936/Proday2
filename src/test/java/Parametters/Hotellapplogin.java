package Parametters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hotellapplogin {
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void HotelP(String username, String password) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		
	}
	@DataProvider(name="testdata")
	public Object getData(){
		ExcelUilities utils = new ExcelUilities("C:\\Users\\MKUNDANS\\Documents\\Book1.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] logindata = new Object[rows][2];
		for(int i=0; i<rows; i++) {
			for (int j=0; j<2; j++ ) {
				logindata[i][j]=utils.getdata(0,i+1,j);	
			}
		}
		return logindata;
	}
	
	

}
