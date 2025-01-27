package excelRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MKDataRead {
WebDriver driver;
@BeforeClass

public void setUp() throws InterruptedException {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2);

	driver.get("https://login.wordpress.org/");
	Thread.sleep(5);
}
@Test(dataProvider = "TestData")
public void login(String uname,String pws) throws InterruptedException {
	WebElement un= driver.findElement(By.id("user_login"));
	un.sendKeys(uname);
	Thread.sleep(2);

	WebElement pw= driver.findElement(By.id("user_pass"));
	pw.sendKeys(pws);
	Thread.sleep(2);

	WebElement logbutton= driver.findElement(By.id("wp-submit"));
	logbutton.click();
	Thread.sleep(2);
	
	
}
@DataProvider(name="TestData")
public String [][] getData(){
	String data[][]= {{"codeing","11234"},
	                  {"pass","54654"},
	                  {"hghgjg","978866"},
	                                    };
	return data;
}
@AfterClass
public void tearDown() {
	driver.close();
	driver.quit();
}

}
