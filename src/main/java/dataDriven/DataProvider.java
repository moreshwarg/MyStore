package dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DataProvider {
	WebDriver driver;
@BeforeMethod
	public void setup() throws InterruptedException {
	 driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/v1/");
	Thread.sleep(2000);
    
}

//@Test(@dataProvider = TestData)
public void loginCredEnter() throws InterruptedException {
	WebElement un=driver.findElement(By.id("user-name"));
	un.sendKeys("");
    Thread.sleep(2000);
    WebElement pass=   driver.findElement(By.id("password"));
    pass.sendKeys("");
    Thread.sleep(2000);
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(2000);
}
@org.testng.annotations.DataProvider(name="TestData")
public Object[][] TestData() {
	Object[][] tdata= new Object[2][];
	
	return tdata;
}
}
