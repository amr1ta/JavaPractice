package dbAgeCalculator;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TestAge {
		WebDriver driver;
		
	@Test(priority=1)
		  public void invokeBrowser() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrita\\Desktop\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 driver.get("https://amr1ta.github.io/WebPageToCalculateAge/");
		  }



@DataProvider
	public Iterator<Object[]> getTestData() throws Exception {
		
		ArrayList<Object[]> testData= FetchDataFromDB.getdata();
		return testData.iterator();
	}

	  
	@Test(dataProvider = "getTestData",priority=2)
	  public void calculateAge(String Name, String Dob, int year) throws Exception {
		
			driver.findElement(By.xpath("/html/body/form/div/input[1]")).clear();
			driver.findElement(By.xpath("/html/body/form/div/input[1]")).sendKeys(Name);
			driver.findElement(By.xpath("/html/body/form/div/input[2]")).clear();
			driver.findElement(By.xpath("/html/body/form/div/input[2]")).sendKeys(Dob);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Thread.sleep(2000); 
			String msg= driver.findElement(By.id("demo")).getText();
			int curYear= getCurrentYear();
			int age = curYear-year;
			Assert.assertEquals("Hi "+Name+"! Your age is "+age, msg);
		
		}
	  

	@Test
	public int getCurrentYear() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String currentdate=dateFormat.format(date);
		String year= currentdate.substring(0, 4);
		int currentYear=Integer.parseInt(year);
		return currentYear;
	}
	  


	@Test(priority=3)
	  public void tearDown() {
		
		driver.quit();
	  }


	  
	}


