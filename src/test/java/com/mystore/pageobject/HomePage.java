package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
	ldriver =rdriver;
	PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//*[text()='Welcome back Moreshwar']")
	private WebElement usernameText;
	
	@FindBy(xpath="(//a[contains(text(),'Men')])[3]")
	private WebElement MenOption;
	
	@FindBy(xpath="(//a[contains(text(),'Fragrance Sets')])")
	private WebElement Fregnance;
	
	@FindBy(xpath="//*[contains(text(),'Not Moreshwar? Logoff')]")
	private WebElement logOut;
	
	public void menuOption() {
Actions act = new Actions(ldriver);
act.moveToElement(MenOption).build().perform();
	}
	
	public void fregnance() {
		Fregnance.click();
	}
	public String getUsernameText() {
		String text=usernameText.getText();
	return text;
	}
	public void clickingOnMenuoption() {
		usernameText.click();
	}
	public void clickingponlogOut() {
		logOut.click();
	}
	
	
	
}
