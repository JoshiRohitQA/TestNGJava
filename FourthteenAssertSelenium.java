package testNgpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FourthteenAssertSelenium {
	
	WebDriver driver;
	
	@Test(dataProvider = "inputs")
	public void loginSearch(String username ,String password ,String product) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement userN=driver.findElement(By.xpath("//input[@id='ap_email']"));
		userN.sendKeys(username);
		WebElement Continuebtn=driver.findElement(By.xpath("//input[@id='continue']"));
		Continuebtn.click();
		WebElement passN=driver.findElement(By.xpath("//input[@id='ap_password']"));
		passN.sendKeys(password);
		WebElement signintn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signintn.click();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(product+ Keys.ENTER);
		
		List<WebElement> pro=driver.findElements(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']/span/div"));
		
		System.out.println(pro.size());
		
		Assert.assertTrue(pro.size()>1);
		
		
	}
	
	@DataProvider(name="inputs")
	public Object[][] prodData(){
		Object[][] pro1= new Object[1][3];
		pro1[0][0]="9873733935";
		pro1[0][1]="Rj@003037";
		pro1[0][2]="shoes";
		return pro1;
	}

}

