package testNgpro;

import org.testng.annotations.Test;

public class FourthPro {
	
	@Test
	
	public void login() {
		System.out.println("login");
	}
	
@Test(priority=-1)
	
	public void registration() {
		System.out.println("registration");
	}
	
@Test(priority=3)

public void logout() {
	System.out.println("logout");
}
	


}
