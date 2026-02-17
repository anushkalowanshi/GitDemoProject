package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//input[@value='Log In']") WebElement login;
	@FindBy(xpath = "//a[normalize-space()='Forgot login info?']") WebElement loginfo;
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement Register;
	@FindBy(xpath = "//p[@class='error']") WebElement error;
	
	public void setUsername(String s) {
		username.sendKeys(s);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	
	public void clickbtn() {
		login.click();
	}
	
	public void loginfo() {
		loginfo.click();
	}
	
	public void Register() {
		Register.click();
	}
	
	
	public String getErrorMessage() {
		return error.getText();
	}
     
}
