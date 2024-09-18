package AmazonDataTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search10pro extends Launch_Quite{
	@Test(dataProvider = "inputs")
	public void searchpro(String input) {
		WebElement searc=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searc.sendKeys(input+Keys.ENTER);
	}
	
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"shoes"},{"moibile"},{"laptop"},{"mouse"},{"shirt"},{"trousers"},{"ipad"},{"s24"},{"vr"},{"monitor"}};
	}

}
