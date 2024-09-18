package testNgpro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NinthDataDrivenInt {
	
	@Test(dataProvider = "inputs")
	public void method1(int input) {
		System.out.println(input);
	}
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{13},{21},{26},{19},{7}};
	}

}
