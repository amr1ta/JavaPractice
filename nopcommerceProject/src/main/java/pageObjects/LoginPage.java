package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\'ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName\']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\'ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password\']")
	WebElement password;
	
	@FindBy (xpath= "//*[@id=\'ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_LoginButton\']")
	WebElement loginbtn;
	
	@FindBy (partialLinkText = "Log out")
	WebElement logoutbtn;
	
	public void set_username(String userName) {
		username.clear();
		username.sendKeys(userName);
	}
	
	public void set_password(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	
	public void click_login() {
		loginbtn.click();
	}
	
	public void click_logout() {
		logoutbtn.click();
	}
}
