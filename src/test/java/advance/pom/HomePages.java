package advance.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	WebDriver ldriver;
@FindBy (xpath= "//*[@id='categorymenu']/nav/ul/li[7]/a")
private WebElement  hairCare;

@FindBy (xpath= "//*[@id='maincontainer']/div/div/div/div/div[3]/div[1]/div[2]/div[3]/a/i")
private WebElement  shampooCart;

@FindBy (xpath="//*[@id='product']/fieldset/div[5]/ul/li/a")
private WebElement addToCart;


@FindBy (xpath="(//*[@id='cart_checkout1'])[1]")
private WebElement checkout;

@FindBy (xpath="/html/body/div/div[2]/div/div/div//div[1]/div/a")
private WebElement confirmOrder;

@FindBy (xpath="( //*[contains(text(),'Your Order Has Been Processed!')])[2]")
private WebElement valiDateSuccessmsg;

public HomePages(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
public void hairCareMenuClick() {
	hairCare.click();
}
public void clickingOnShampoo() {
	shampooCart.click();
}
public void clickOnAddToCart() {
	addToCart.click();
}
public void checkoutButton() {
	checkout.click();
}
public void confirmOrderButton() {
	confirmOrder.click();
}
public void valSuccessMsg() {
	valiDateSuccessmsg.getText();
	//Your Order Has Been Processed!
	
}
}
