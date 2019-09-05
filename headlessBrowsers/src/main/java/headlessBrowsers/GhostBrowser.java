package headlessBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GhostBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.phantomjs().setup();
		driver = new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

	}

}
