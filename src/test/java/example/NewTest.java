package example;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;


public class NewTest {		
	  	
		@Test				
		public void login() {
			  System.out.println("BUILD STARTS RUNNING FROM HERE");
			  
//			    System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
//			    WebDriver driver = new FirefoxDriver();
			   
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    
			    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    driver.manage().window().maximize();
			   driver.get("https://mail.google.com");	
			   
			   
		}
		
		
//		@BeforeTest
//		public void beforeTest() {	
//	   WebDriver driver = new ChromeDriver();  
//		}		
//		@AfterTest
//		public void afterTest() {
//			driver.quit();			
//		}		
}