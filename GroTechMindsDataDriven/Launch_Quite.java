package GroTechMindsDataDriven;

import java.io.File;
import java.io.IOException;
import java.util.Date;

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
	public void login(String browserName) throws InterruptedException {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	
	@AfterMethod
	public void ScreenShotQuite() throws InterruptedException, IOException {
		
		
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
		File destination = new File("C:\\Users\\rohit.joshi\\Desktop\\New folder\\Java Diagrams\\GroTechRegist\\RegistForm"+dateFormat1+".png");
		FileHandler.copy(source, destination);
		
		
		driver.quit();
		
	}
}
