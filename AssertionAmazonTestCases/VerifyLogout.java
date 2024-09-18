package AssertionAmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogout extends BaseClass {
	@Test
	public void logout() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement accountSec=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(accountSec).perform();
		
		Thread.sleep(2000);
		WebElement signOut=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signOut.click();
		
		Thread.sleep(2000);
		
		WebElement inputEmail=driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		Assert.assertTrue(inputEmail.isDisplayed() && inputEmail.isEnabled());
		
	}

}
