package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps {
	
	WebDriver driver;
	LoginPage lp;
	
	@Given("^User launch Chrome Browser$")
	public void user_launch_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		lp = new LoginPage(driver);
	}

	@When("^user opens url \"([^\"]*)\"$")
	public void user_opens_url(String url)  {
	    driver.get(url);
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String username, String password) {
	   lp.set_username(username);
	   lp.set_password(password);
	}

	@When("^click on Login$")
	public void click_on_Login() {
		
	 lp.click_login();
	 
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Your login attempt was not successful")) {
			driver.close();
			System.out.println("invalid credentials");
			Assert.assertTrue(false);
		}else {
	    String t1=driver.getTitle();
	    Assert.assertEquals(title, t1);;
	    System.out.println("login successful");
		}
	}

	@Then("^logout$")
	public void logout() {
		
	    lp.click_logout();
	}

	@Then("^close bowser$")
	public void close_bowser() {
	   driver.quit(); 
	}

}

