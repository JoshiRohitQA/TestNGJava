package AmazonTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends Launch_Quit {
	
	
	@Test
	 public void searching2() throws InterruptedException {
	 WebElement searchBox1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 searchBox1.sendKeys("shoes"+Keys.ENTER);
	 
	 Thread.sleep(2000);
	 
	 WebElement pro=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
	 pro.click();
	  
	 
	 Set<String>s1=driver.getWindowHandles();
	 
	 System.out.println(s1);
	   
	}

}
