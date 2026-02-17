package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginInfo extends basePage {

	public LoginInfo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@id='address.street']") WebElement address;
	 @FindBy(xpath = "//input[@id='address.city']") WebElement city;
	 @FindBy(xpath = "//input[@id='address.state']") WebElement state;
	 @FindBy(xpath ="//input[@id='address.zipCode']" ) WebElement zipCode;
	 @FindBy(xpath = "//input[@id='ssn']") WebElement SSN;
	 @FindBy(xpath = "//input[@value='Find My Login Info']") WebElement lgnbtn;
	 
	 public void enterfirstName(String f) {
		 firstName.sendKeys(f);
	 }
	 public void enterlastName(String l) {
		 lastName.sendKeys(l);
	 }
	 
	 public void enteraddress(String add) {
		 address.sendKeys(add);
	 }
	  
	 public void entercity(String cty) {
		 city.sendKeys(cty);
	 }
	 public void enterstate(String st) {
		 state.sendKeys(st);
	 }
	 
	 public void enterzipCode(String code) {
		 zipCode.sendKeys(code);
	 }
	 
	 
	 
	 public void SSN(int num) {
		 SSN.sendKeys(String.valueOf(num));
	 }
	 
	 public void clickbtn() {
		 lgnbtn.click();
	 }
}
