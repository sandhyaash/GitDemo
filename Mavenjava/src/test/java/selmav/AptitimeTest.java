package selmav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AptitimeTest {
	@Test
	public void login() throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://localhost/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(1000);
		System.out.println("Home page title:"+d.getTitle());
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[contains(text(),'Settings')])[1]")).click();
		System.out.println("Successfully clicked on settings button");
		d.close();
		System.out.println("Successfully closed the browser");
		
	
	}
}
