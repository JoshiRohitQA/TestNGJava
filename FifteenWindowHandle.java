package testNgpro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FifteenWindowHandle {
	
	WebDriver driver;
	
	@Test
	public void windowHand() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchBox1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 searchBox1.sendKeys("shoes"+Keys.ENTER);
		 
		 Thread.sleep(2000);
		 
		 WebElement pro=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
		 pro.click();
		  
		 
		 Set<String>s1=driver.getWindowHandles();
		 
		 System.out.println(s1);
		 
		 Iterator<String> i11=s1.iterator();
		 
	String parentId=	 i11.next();
		 
		String childId= i11.next();
		
		driver.switchTo().window(childId);
		
		WebElement addTOcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addTOcart.click();
		
		 
		 
		
		 
		 
		 
		 
	}

}
