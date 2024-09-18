package ReviseIretry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryMethod {
	
	WebDriver driver;
	@Test(retryAnalyzer = ReviseIretry.initialRet.class)
	public void reTryM() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("wew"));
		search.click();
	}

}
