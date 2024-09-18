package testNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EightDataDriven {
	
	WebDriver driver;
	@Test(dataProvider = "inputs")
	
	public void testCase1(String input) {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in");
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@DataProvider(name="inputs")
	
	public Object[][] data1(){
		return new Object [][] {{"How to become presider"},{"How to wake up at 4am"}};
	}

}
