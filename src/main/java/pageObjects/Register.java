package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends basePage {

	public Register(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='customer.firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@id='customer.lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@id='customer.address.street']")  WebElement address;
	@FindBy(xpath = "//input[@id='customer.address.city']")  WebElement city;
	@FindBy(xpath = "//input[@id='customer.address.state']") WebElement state;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']") WebElement zipCode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']") WebElement phone;
	@FindBy(xpath = "//input[@id='customer.ssn']") WebElement SSN;
	@FindBy(xpath = "//input[@id='customer.username']") WebElement username;
	@FindBy(xpath = "//input[@id='customer.password']")  WebElement password;
	@FindBy(xpath = "//input[@id='repeatedPassword']")  WebElement confirm;
	@FindBy(xpath = "//input[@value='Register']")  WebElement register;
	public void enterfirstName(String s) {
		firstName.sendKeys(s);
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
	 
	 public void enterstate(String stat) {
		 state.sendKeys(stat);
	 }
	 
	 public void enterzipCode( String zip) {
		zipCode.sendKeys( zip); 
	 }
	 
	 public void enterSSN(String ssn) {
		 SSN.sendKeys("ssn");
	 }
	public void enterphone(String phn) {
		phone.sendKeys(phn);
	}
	public void enterusername(String user) {
		username.sendKeys(user);
	}
	
	public void enterpass(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void enterconfirm(String confm) {
		confirm.sendKeys(confm);
	}
	public void register() {
		register.click();
	}
	
	
	
	
}
