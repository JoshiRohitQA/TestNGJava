package AmazonDataTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quite {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchAmazon(String browserName) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		if(browserName.equals("edge")) {
			driver= new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/");
		
	}
	
	@AfterMethod
	public void screenshot_close() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\GitHub for Java\\TestNGwithJava\\Amazon10"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
		driver.quit();
	}

}
