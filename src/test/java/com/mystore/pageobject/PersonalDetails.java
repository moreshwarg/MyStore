package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails {
	WebDriver ldriver;
public PersonalDetails(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(ldriver,this);
	
}
	@FindBy(xpath="//*[contains(@id,'AccountFrm_firstname')]")
	private WebElement fname;
public void fname() {
	fname.sendKeys("Moreshwar");
}

 
}