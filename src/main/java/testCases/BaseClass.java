package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
  public WebDriver driver;

  @BeforeClass
  public void setup() {
	 
	driver = new ChromeDriver();  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
  }
  
  
  @AfterClass
  public void tear() {
	  driver.quit();
  }
  
  
  
  
}
