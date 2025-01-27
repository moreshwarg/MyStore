package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart1 {
	WebDriver ldriver;
	
public AddToCart1(WebDriver rdriver) {
	ldriver= rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(xpath="//*[@class='cart']")
private WebElement cart;


public void cart() {
	cart.click();  
}
	
}
