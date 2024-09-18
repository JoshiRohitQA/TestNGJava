package AssertionAmazonTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifySearchingProduct extends BaseClass {
	
	@Test(dataProvider = "inputs")
	public void searchPRo(String input) throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(input+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']/span/div"));
		
		System.out.println(li.size());
		
		Assert.assertTrue(li.size()>1);
		
	}
	
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"shoes"}};
	}

}
