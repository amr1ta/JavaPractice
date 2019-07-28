package ecom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ecom_day1 {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void invokeBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrita\\Desktop\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			 driver.get("http://live.guru99.com/index.php/");
	}
  @Test(priority=1)
  public void title() {
	  System.out.println(driver.getTitle());
	  String text=(driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[1]/div/div/h2")).getText());
	  System.out.println(text);
	  String match = text.replaceAll("FOR", "");
	  match=match.substring(0, match.lastIndexOf(" ")-3);
	  System.out.println(match);
	  Assert.assertEquals(match, "THIS IS DEMO SITE");
  }
  
  @Test(priority=2)
  public void mobile() {
	  driver.findElement(By.xpath("//*[@id=\'nav\']/ol/li[1]/a")).click();
	 String str=(driver.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[1]/h1")).getText());
	 System.out.println(str);
	 Assert.assertEquals(str, "MOBILE");
	 System.out.println(driver.getTitle());
	 Select select= new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
	 select.selectByVisibleText("Name");;
  }

  @AfterMethod
  public void tearDown() {
		
		driver.quit();
	  }
}
