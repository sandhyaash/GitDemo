package selmav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserTest {
	
	@Test
	public void openBrowser() {
		ChromeOptions opt = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
		
		WebDriver d = new ChromeDriver(opt);
		d.manage().window().maximize();
		d.get("http://google.com");
	}
}
