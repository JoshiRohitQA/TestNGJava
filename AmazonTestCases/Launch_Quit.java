package AmazonTestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void launch() {
	driver = new ChromeDriver();
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
	
	}
	
	
	@AfterMethod
	
	
	public void Quit() throws IOException, InterruptedException {
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time=d2.toString();
		String date =time.substring(8,10);
		String month = time.substring(4,7);
		String year=time.substring(time.length()-4);
		String exactTime = time.substring(11,19);
		String correctTime=exactTime.replace(":", "_");
		String dateFormat1= date.concat(month).concat(year).concat(correctTime);
		
		
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\amazontest"+dateFormat1+".png");
		FileHandler.copy(source, destination);
		
		
		
		Actions action = new Actions(driver);
		WebElement log = driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn']"));
		action.moveToElement(log).perform();
		Thread.sleep(2000);
		WebElement logout= driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
		logout.click();
		
		
		driver.quit();
		
	}


}
