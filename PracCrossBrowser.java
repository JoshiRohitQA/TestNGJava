package testNgpro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracCrossBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void launchFlip(String reqbrowser) throws IOException {
		if(reqbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(reqbrowser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		if(reqbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.get("https://www.flipkart.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\GitHub for Java\\TestNGwithJava\\FlipLaunch"+Math.random()+".png");
		FileHandler.copy(source, destination);
	}

}
