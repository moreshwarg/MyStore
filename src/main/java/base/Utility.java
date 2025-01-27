package base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void screenShot() throws IOException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	File source=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new  File("C:\\Users\\Moreshwar\\Desktop\\Selenium\\Screen1.jpg");
	FileHandler.copy(source, dest);
	Thread.sleep(5000);
}
	}