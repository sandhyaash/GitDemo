package selmav;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public void testAmazon() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.amazon.in");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> suggList = d.findElements(By.xpath("//div[@id='suggestions']/descendant::div"));
		String searchText = "iphone 4";
		for(WebElement sug:suggList) {
			System.out.println(sug.getText());
			if(searchText.equals(sug.getText()))
			{
				System.out.println("found!!!"+searchText);
				sug.click();
				break;
			}
		}
	} 
}
