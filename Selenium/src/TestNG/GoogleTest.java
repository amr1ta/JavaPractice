package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrita\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.get("http://www.google.co.in");
		 
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3)
	public void googleLogoTest() {
		boolean b= driver.findElement(By.xpath("//*[@id=\'hplogo\']")).isDisplayed();
		System.out.println(b);
	}
	 
	
	@Test(priority=2)
	public void googleMailTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
