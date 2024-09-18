package AssertionAmazonTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin extends BaseClass {
	
	@Test()
	public void verifyLog() {
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Titile does not match");
		
		
	}
	
	
}
