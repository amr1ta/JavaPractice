package com.test;

import org.testng.annotations.Test;

import test.utility.TestDataUtility;

import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.get("https://old.reddit.com/");
		 //driver.findElement(By.linkText("Log in")).click();
	  }



@DataProvider
public Iterator<Object[]> getTestData() {
	
	ArrayList<Object[]> testData= TestDataUtility.getDataFromExcel();
	System.out.println(testData);
	return testData.iterator();
}


  
@Test(dataProvider = "getTestData")
  public void login(String userName, String password) {
	driver.findElement(By.xpath("//*[@id=\'login_login-main\']/input[2]")).sendKeys(userName);
	driver.findElement(By.xpath("//*[@id=\'login_login-main\']/input[3]")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\'login_login-main\']/div[4]/button")).click();
	driver.findElement(By.linkText("logout")).click();
	
  }
  


@AfterMethod
  public void tearDown() {
	
	driver.quit();
  }


  
}
