package dynamicListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dl {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchar= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchar.sendKeys("macbook");
		
		List<WebElement> option=driver.findElements(By.xpath("//*[@id='sac-autocomplete-results-container']/div/div/div"));
	for(WebElement list:option) {
		System.out.println(list.getText());
		Actions act= new Actions(driver);
		
	}
	}

}
