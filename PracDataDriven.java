package testNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracDataDriven {
	
	WebDriver driver;
	
	@Test(dataProvider = "inputs")
	public void testCase1(String input) {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	WebElement searchbox= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	searchbox.sendKeys(input+Keys.ENTER);
	
	}
	
	@DataProvider(name="inputs")
	 public Object[][] data1(){
		return new Object[][] {{"How to do testing"},{"Amazon"}};
	}
	

}
