package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin {
	WebDriver ldriver;

	public AccountLogin(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath ="//*[@id='customer_menu_top']/li/a")
	private WebElement WelcomeMenu;


	@FindBy(xpath="//*[contains(@id,'loginFrm_loginname')]")
	private WebElement username;

	@FindBy(xpath="//*[contains(@id,'loginFrm_password')]")
	private WebElement passwors;

	@FindBy(xpath="(//*[@class='btn btn-orange pull-right'])[2]")
	private WebElement loginButton;
	public void welcomeMenu() {
		WelcomeMenu.click();
		}
	public void username() {
		username.sendKeys("Moreshwar");
	}
	public void username1(String unm) {
		username.sendKeys(unm);
	}


	public void passwors() {
		passwors.sendKeys("Gayke@123");
	}

	public void passwors1(String pwd) {
		passwors.sendKeys(pwd);
	}

	public void loginButton() {
		loginButton.click();
	}

}
