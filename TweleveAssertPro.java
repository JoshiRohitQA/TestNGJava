package testNgpro;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TweleveAssertPro {
	WebDriver driver;
	@Test
	public void amalanch() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin%26adgrpid%3D1315017564951826%26hvadid%3D82188862025546%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D157122%26hvtargid%3Dkwd-82189528107688%3Aloc-90%26hydadcr%3D14452_2334185%26msclkid%3Da665b5452f98127e0a94d39a845a34af&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='ap_email']"));
		userName.sendKeys("9873733935");
		WebElement continueBtn=driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Rj@003037");
		WebElement submitBtn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submitBtn.click();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry");
		
	}

}
