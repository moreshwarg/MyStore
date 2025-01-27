package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();

	String url= readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	public static WebDriver driver;

	public static Logger logger;

	@BeforeClass

	public void setup() {
		//String browser = "chrome";

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			driver= null;
			break;

		}
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		//for login 
		logger = LogManager.getLogger("TDDFrameWork");

		driver.get(url);
		logger.info("url opened");
	}
	@AfterClass
	public void tearDown() {

		driver.quit();
	}
	public void captureScreenShot(WebDriver driver, String testName) throws IOException {
		//Step 1: convert web driver object to TakesScreenShot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//Step 2: call getScreenShotAs method to create image file
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		String timeStamp1= new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String ScreenshotName = "MyScreenshotTest" + timeStamp1 + ".png";
		File dest = new File(System.getProperty("user.dir") +"//ScreenShot//"  + testName + ScreenshotName);
		//File dest = new File("C:\\Users\\Moreshwar\\eclipse-workspace cucumber\\TDDFrameWork\\screenshot" + testName + ".png");
		//(System.getProperty("C:\\Users\\Moreshwar\\eclipse-workspace cucumber\\TDDFrameWork") +"//Reports//" + reportName);
		// Step 3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
}
