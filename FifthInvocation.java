package testNgpro;

import org.testng.annotations.Test;

public class FifthInvocation {
	@Test(invocationCount = 10,priority = 2)
	 public void testCase1() {
		System.out.println("1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("2");
	}
	
	@Test(enabled=false)
	public void testCase3() {
		System.out.println("will not execute");
	}

}
