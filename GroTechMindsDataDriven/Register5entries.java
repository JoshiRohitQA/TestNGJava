package GroTechMindsDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register5entries extends Launch_Quite{
	

	@Test(dataProvider = "inputs")
	public void registerForm(String firstName,String lastName,String email,String Password,String presentAddress,String permanentAddress,String pinCode)  {
		WebElement firstNform=driver.findElement(By.xpath("//input[@id='fname']"));
		firstNform.sendKeys(firstName);
		
		WebElement LastNform=driver.findElement(By.xpath("//input[@id='lname']"));
		LastNform.sendKeys(lastName);
		
		WebElement Emailform=driver.findElement(By.xpath("//input[@id='email']"));
		Emailform.sendKeys(email);
		
		WebElement Passwordform=driver.findElement(By.xpath("//input[@id='password']"));
		Passwordform.sendKeys(Password);
		
		WebElement MaleForm=driver.findElement(By.xpath("//input[@id='male']"));
		MaleForm.click();
		
		WebElement SkillsForm=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s1 = new Select(SkillsForm);
		s1.selectByIndex(1);
		
		WebElement CountryForm=driver.findElement(By.xpath("//select[@id='Country']"));
		Select s2 = new Select(CountryForm);
		s2.selectByValue("India");
		
		
		WebElement PresentAddForm=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		PresentAddForm.sendKeys(presentAddress);
		
		WebElement PermanentAddForm=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		PermanentAddForm.sendKeys(permanentAddress);
		
		WebElement PincodeForm=driver.findElement(By.xpath("//input[@id='Pincode']"));
		PincodeForm.sendKeys(pinCode);
		
		
		WebElement ReligionForm=driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s3 = new Select(ReligionForm);
		s3.selectByValue("Hindu");
		
		
		WebElement relocateForm=driver.findElement(By.xpath("//input[@id='relocate']"));
		relocateForm.click();
		
		
		WebElement SubmitForm=driver.findElement(By.xpath("//button[@name='Submit']"));
		SubmitForm.click();
		
	}
	
	@DataProvider(name="inputs")
	
	public Object[][] data1(){
		Object[][] d1= new Object[5][7];
		d1[0][0]="Rohit";
		d1[0][1]="Joshi";
		d1[0][2]=" r1@gmail.com";
		d1[0][3]="123456789";
		d1[0][4]="Delhi";
		d1[0][5]=" NewDelhi";
		d1[0][6]="110053";
		
		d1[1][0]="Mohit";
		d1[1][1]="Bhatt";
		d1[1][2]=" m1@gmail.com";
		d1[1][3]="123456789";
		d1[1][4]="Delhi";
		d1[1][5]="Delhi";
		d1[1][6]="110053";
		
		d1[2][0]="Atul";
		d1[2][1]="Kumar";
		d1[2][2]=" a1@gmail.com";
		d1[2][3]="123456789";
		d1[2][4]="Delhi";
		d1[2][5]="Delhi";
		d1[2][6]="110053";
		
		d1[3][0]="Sandeep";
		d1[3][1]="kumar";
		d1[3][2]=" s1@gmail.com";
		d1[3][3]="123456789";
		d1[3][4]="Delhi";
		d1[3][5]="Delhi";
		d1[3][6]="110053";
		
		d1[4][0]="Bharat";
		d1[4][1]="Singh";
		d1[4][2]=" b1@gmail.com";
		d1[4][3]="123456789";
		d1[4][4]="Delhi";
		d1[4][5]="Delhi";
		d1[4][6]="110053";
				
		return d1;
		
	}
	
}
	
	
