package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC_001_NormalLogin extends BaseClass {

	@Test
	public void verify_Login() {
	
		HomePage hp = new HomePage(driver);
		
		hp.setUsername("sanjana");
		hp.setPassword("sanjana@123");
		hp.clickbtn();
	}
	
	
	
}
