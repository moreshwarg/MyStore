package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedScreenShot {
	WebDriver driver;
	
	@Test
	public void mains(String URL) throws InterruptedException {
		
			 driver = new ChromeDriver();
			  
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println("get title from chrome"+ driver.getTitle());
		driver.findElement(By.xpath("hdhd"));
	}

@AfterMethod
public void tearDown(ITestResult result) throws IOException, InterruptedException {
if(ITestResult.FAILURE==result.getStatus()) {
	Utility.screenShot();
}
else {
	System.out.println("Not taken screenshot");
}

driver.close();
}
}
