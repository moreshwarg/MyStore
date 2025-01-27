package com.mystore.testcases;

import org.testng.annotations.Test;

import advance.pom.HomePages;
import advance.pom.LoginPage;

public class AdvanceTest extends BaseClass {
@Test
	public void placeOrder() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);
	lp.clickingOnAccount();
	Thread.sleep(2000);
	lp.enteringUname("Moreshwar");
	lp.enteringPass("Gayke@123");
	lp.clickingOnAccount();
	Thread.sleep(2000);
	System.out.println("User logged succefully");
	
	HomePages hp= new HomePages(driver);
	Thread.sleep(2000);
	hp.hairCareMenuClick();
	Thread.sleep(2000);
	hp.clickingOnShampoo();
	Thread.sleep(2000);
	hp. clickOnAddToCart() ;
	Thread.sleep(2000);
	System.out.println("User on home page");
	hp.checkoutButton();
	Thread.sleep(4000);
	hp.confirmOrderButton();
	Thread.sleep(20000);
	hp.valSuccessMsg();
	Thread.sleep(20000);
	System.out.println("User ordered successfully");
	
}
}
