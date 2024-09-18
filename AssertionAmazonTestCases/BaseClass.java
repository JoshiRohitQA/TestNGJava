package AssertionAmazonTestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod()
	
	public void setUp(String browserName) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement userN=driver.findElement(By.xpath("//input[@id='ap_email']"));
		userN.sendKeys("9873733935");
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Rj@003037");
		WebElement signIN =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIN.click();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() throws IOException {
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		
		String time=d2.toString();
		
		String date=time.substring(8, 10);
		String month = time.substring(4,7);
		String exTi=time.substring(11,19);
		String exactTime= exTi.replace(":", "_");
		String year=time.substring(time.length()-4);
		
		String dateFormat= date.concat(month).concat(year).concat(exactTime);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\AmazonAssertion\\Assertion"+dateFormat+".png");
		FileHandler.copy(source, destination);
		
		driver.quit();
	}

}
