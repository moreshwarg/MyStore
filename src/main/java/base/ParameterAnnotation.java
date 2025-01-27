package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public  void mains(String URL) throws InterruptedException {
		if(URL.equals("chrome")) {
			 driver = new ChromeDriver();
			  
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println("get title from chrome"+ driver.getTitle());
	}
		else if(URL.equals("firefox")) {
			 driver = new FirefoxDriver();
			  
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println("get title from firefox"+ driver.getTitle());
	}
	}
	
	@Test
	public void teardown() {
		driver.close();
	}
}
