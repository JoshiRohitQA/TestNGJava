package GoogleDataTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchItem extends Launch_Quite{
	@Test(dataProvider = "inputs")
	public void searchGoogle(String input) {
		WebElement search11=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search11.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider(name="inputs")
	public Object[][] data111(){
		return new Object[][] {{"Intelegencia"},{"TestNG"}};
	}

}
