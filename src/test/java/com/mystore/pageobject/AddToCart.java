package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver ldriver;
	public AddToCart(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="")
	private WebElement Productimage;

	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/a/img")
	private WebElement cart;

	public void Productimage() {
		Productimage.click();
	}

}
