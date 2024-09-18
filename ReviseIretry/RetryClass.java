package ReviseIretry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryClass {
	
	WebDriver driver;
	
	@Test(retryAnalyzer = ReviseIretry.initalRetry.class)
	public void searchGoogle() {
		driver=new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.xpath("xds"));
	search.click();
	}

}
