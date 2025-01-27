package advance.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	@FindBy(xpath ="//*[@id='customer_menu_top']/li/a")
	private WebElement WelcomeMenu;
	
@FindBy  (xpath="(//*[text()='Account'])[1]")
private WebElement account;
@FindBy (xpath="//*[@id='loginFrm_loginname']")
private WebElement uname;
@FindBy (xpath ="//*[@id='loginFrm_password']")
private WebElement pass;

@FindBy (xpath="//button[@title='Login']")
private WebElement loginButton;

public LoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
public void clickingOnAccount() {
	WelcomeMenu.click();
}
public void enteringUname(String un) {
	uname.sendKeys(un);
}
public void enteringPass(String pss) {
	pass.sendKeys(pss);
}
public void clickOnButton() {
	loginButton.click();
}

}
