import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class NaukriResumeUpload {
	
		
	public void upload_resume() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//driver =  new HtmlUnitDriver();
		//driver.get("https://www.google.co.in/");
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/nlogin/logout");
	System.out.println(driver.getTitle());
		driver.findElement(By.id("usernameField")).sendKeys("amrita.mahapatra11@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("RsK2Yd@VGvVGhp7");
		driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[3]/button")).click();
		driver.findElement(By.xpath("//div[@title=\'Amrita Mahapatra\']")).click(); 
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\Amrita\\Documents\\GDrive\\Amrita_Mahapatra_Resume.docx");
		Thread.sleep(5000); 
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
				
		NaukriResumeUpload naukri = new NaukriResumeUpload();
		naukri.upload_resume();
	}

}
