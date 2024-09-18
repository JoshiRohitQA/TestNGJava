package testNgpro;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SixthLaunchBrowser {
	
	WebDriver driver;
	
	@Test
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number to launch desired browser");
		int count=sc.nextInt();
		
		if(count==1) {
		driver=new ChromeDriver();
		}
		if(count==2) {
			driver=new EdgeDriver();
		}
		if(count==3) {
			driver=new FirefoxDriver();
		}
		sc.close();
	}

}
