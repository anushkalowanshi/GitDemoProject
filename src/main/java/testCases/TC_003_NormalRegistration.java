package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Register;

public class TC_003_NormalRegistration extends BaseClass {
	@Test
   public void verify_Registration() {
	   HomePage hp = new HomePage(driver);
	   hp.Register();
	   
	   Register  r = new Register(driver);
	   r.enterfirstName("nazia");
	   r.enterlastName("khan");
	   r.enteraddress("ashi girls hostel");
	   r.entercity("bhopal");
	   r.enterstate("madhya pradesh");
	   r.enterzipCode("9301");
	   r.enterSSN("9301");
	   r.enterphone("9301460596");
	   r.enterusername("nazia");
	   r.enterpass("nazia@123");
	   r.enterconfirm("confm");
	   r.register();
   }
}
