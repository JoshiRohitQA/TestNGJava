package testNgpro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecPro {
	
	@Test 
	
	public void testCase1() {
		System.out.println("Test");
	}
	
	@BeforeSuite
	
	public void bs() {
		System.out.println("Bs");
	}
	
@BeforeTest
	
	public void bt() {
		System.out.println("bt");
	}
	
	@BeforeClass
	 public void bc() {
		System.out.println("BC");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BM");
	}
	
	
@AfterSuite
	
	public void as() {
		System.out.println("AS");
	}

@AfterTest

public void at() {
	System.out.println("AT");
}


	
	@AfterClass
	 public void ac() {
		System.out.println("AC");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AM");
	}
	
	
	

}
