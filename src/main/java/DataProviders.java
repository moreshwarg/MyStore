import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
WebDriver driver;
@BeforeClass
public void setup() throws InterruptedException {
	WebDriverManager.chromedriver();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
driver.get("https://login.wordpress.org/");
}

@Test(dataProvider="TestData")
public void login(String usr,String pwd) throws InterruptedException {
	WebElement un= driver.findElement(By.xpath("//*[@id='user_login']"));
	un.sendKeys(usr);
	Thread.sleep(2000);
	WebElement ps= driver.findElement(By.xpath("//*[@id='user_pass']"));
	ps.sendKeys(pwd);
	Thread.sleep(2000);
	WebElement log= driver.findElement(By.xpath("//*[@id='wp-submit']"));
	log.click();
	Thread.sleep(2000);
	
}
@DataProvider(name="TestData")
public String[] [] getData(){ 
String[] [] data= {{"gayke","1234"},
		{"gayke1","12345"},
		{"gayke2","12346"}};
return data;
}
@AfterClass
public void tearDown() {
	driver.close();
}			
}
