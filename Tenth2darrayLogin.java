package testNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tenth2darrayLogin {
	WebDriver driver;
	
	@Test(dataProvider = "inputs")
	public void amaLogin(String username ,String passWord) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin%26adgrpid%3D1315017564951826%26hvadid%3D82188862025546%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D157122%26hvtargid%3Dkwd-82189528107688%3Aloc-90%26hydadcr%3D14452_2334185%26msclkid%3Da665b5452f98127e0a94d39a845a34af&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='ap_email']"));
		userName.sendKeys(username);
		WebElement continueBtn=driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys(passWord);
		WebElement submitBtn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submitBtn.click();
	}
	
	@DataProvider(name="inputs")
	public Object[][] method1(){
		Object[][] d1=new Object[4][2];
		//1st row
		d1[0][0]="9873733935"; //valid mob no
		d1[0][1]="Rj@003037";
		//2nd row
		d1[1][0]="rohitjoshi4353@gmail.com";//valid email id
		d1[1][1]="Rj@003037";
		
		//3rd row
		d1[2][0]="8867557085";//invalid mob no 
		d1[2][1]="Rj@003037";
				//4th row
		d1[3][0]="rohitjoshi43531@gmail.com"; //invalid email id
		d1[3][1]="Rj@003037";
		
		
		return d1;
	}


}
