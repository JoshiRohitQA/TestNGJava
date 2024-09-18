package testNgpro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdPro {
	
	@BeforeMethod
	public void bm1() {
		System.out.println("BM");
	}
	

	
@Test 
	
	public void testCase1() {
		System.out.println("Test");
	}


@Test 

public void testCase2() {
	System.out.println("Test2");
}


@Test 

public void testCase3() {
	System.out.println("Test3");
}


@AfterMethod
public void am() {
	System.out.println("AM");
}



}
