package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC_002_invalidLogin extends  BaseClass{
	@Test
  public void invalid_Login() {
	HomePage hp = new HomePage(driver);
	hp.setUsername("ansh");
	hp.setPassword("ansh@123");
	hp.clickbtn();
	hp.getErrorMessage();
	
	
  }
	
}
