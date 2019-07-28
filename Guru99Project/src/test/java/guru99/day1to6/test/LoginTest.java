package guru99.day1to6.test;

import org.testng.annotations.Test;

import guru99.com.test.utility.TestDataUtility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class LoginTest {

	WebDriver driver;
	
  @BeforeMethod
  public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrita\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		 driver.get("http://www.demo.guru99.com/V4/");
}

  @DataProvider
	public Iterator<Object[]> getTestData() {
		
	ArrayList<Object[]> testData= TestDataUtility.getDataFromExcel();
	System.out.println(testData);
		return testData.iterator();
	}
  
	
	@Test(dataProvider= "getTestData", priority=1)
	public void login(String userId, String password) {
		driver.findElement(By.xpath("//input[@name=\'uid\']")).sendKeys(userId);
		driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\'btnLogin\']")).click();
		isAlertPresent();
	}
	
	
	@Test
	public boolean isAlertPresent() {

	    boolean presentFlag = false;

	    try {

	        // Check the presence of alert
	        Alert alert = driver.switchTo().alert();
	        // Alert present; set the flag
	        presentFlag = true;
	        // if present consume the alert
	        System.out.println(alert.getText());
	        alert.accept();
	        
	        //( Now, click on ok or cancel button )

	    } catch (NoAlertPresentException ex) {
	        // Alert not present
	        ex.printStackTrace();
	        System.out.println("Login Successful");
	        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText());
	        captureScreenshot();
	    }

	    return presentFlag;
	}
	    
	    
	    @Test
	    public void captureScreenshot(){
	    	try {
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// Now you can do whatever you need to do with it, for example copy somewhere
				FileUtils.copyFile(scrFile, new File("C:\\Users\\Amrita\\eclipse-workspace\\Guru99Project\\screenshot.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }


@AfterMethod
  public void tearDown() {
		
		driver.quit();
	  }

  
  }

