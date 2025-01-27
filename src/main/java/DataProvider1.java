import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1 {
WebDriver driver;
@BeforeClass
public void setUp() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://login.wordpress.org/");
}
@Test(dataProvider="TestData")
public void login(String user,String pas) throws InterruptedException {
	WebElement username=driver.findElement(By.id("user_login"));
	username.sendKeys(user);
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.id("user_pass"));
	pass.sendKeys(pas);
	Thread.sleep(2000);
	WebElement loginbutton=driver.findElement(By.id("wp-submit"));
	loginbutton.click();
	Thread.sleep(2000);
}
@DataProvider(name="TestData")
public String [][]getData(){
	String [] [] d1 ={ {"coding","123445"},
	                     {"sdfghg123","123433"},
	                     {"sdfdgg","12587"}};
	return d1;
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}
