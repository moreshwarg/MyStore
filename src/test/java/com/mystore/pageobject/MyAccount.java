package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	WebDriver ldriver;

	public MyAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[contains(@title,'Continue')]")
	WebElement	 Continue;
	public void clickingonContinue() {
		Continue.click();
	}
	@FindBy(xpath="//*[contains(@id,'loginFrm_loginname')]")
	WebElement userName;
	public void enteringuserName(String uname) {
		userName.sendKeys(uname);
	}
	@FindBy(xpath="//*[contains(@id,'loginFrm_password')]")
	WebElement Password;
	public void enteringPassword(String pwd) {
		Password.sendKeys(pwd); 
	}
	@FindBy(xpath="//*[contains(@title,'Login')]")
	WebElement	LoginButton;
	public void clicksonLoginButton() {
		LoginButton.click();
	 }	
	}
