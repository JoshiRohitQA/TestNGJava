package AssertionAmazonTestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyPayment extends BaseClass{
	@Test(dataProvider = "inputs")
	public void verifyPay(String input) throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(input+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']/span/div"));
		WebElement prod=li.get(1);
		Thread.sleep(2000);
		prod.click();
		
		Set<String>s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		String parentWindow=i1.next();
		String childWindow=i1.next();
		
		driver.switchTo().window(childWindow);
		
		
		WebElement wishList=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		wishList.click();
		
		Thread.sleep(2000);
		
		WebElement closeWishlist=driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']"));
		closeWishlist.click();
		
		WebElement buyNow=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		Thread.sleep(2000);
		buyNow.click();
		
		Thread.sleep(2000);
		
		WebElement verifyOrder=driver.findElement(By.xpath("//span[.='Order Total:']"));
		
		Assert.assertTrue(verifyOrder.isDisplayed());
		
		driver.close();
		
		
		
		
	}
	
	@DataProvider(name="inputs")
	public Object[][] data2(){
		return new Object[][] {{"shoes"}};
	}

}
