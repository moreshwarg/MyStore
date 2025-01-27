package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.maystore.pageobject.CreateAccountPage;
import com.mystore.pageobject.AccountLogin;
import com.mystore.pageobject.HomePage;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;

public class TC_MyAccountPageTest extends BaseClass{
@Test(enabled= false)
	public void VerifyUserregistrationandlogin() throws InterruptedException {
		//open URL
	
			//create object of Indexpage
			IndexPage ip= new IndexPage(driver);
			ip.clickLoginorregister();
			
			MyAccount ap= new MyAccount(driver);
			ap.clickingonContinue();

			CreateAccountPage acp= new CreateAccountPage(driver);	
			acp.enteringFname("Moreshwar");
			acp.enteringLname("Gayke");
			Thread.sleep(2000);
			acp.enteringemail("mgayke3@gmail.com");
			acp.enteringadd("kk sector8");
			acp.enteringcity("mumbai");
			acp.enteringstateRegion("Aberdeen");
			Thread.sleep(2000);
			acp.enteringzipcode("123123");
			acp.enteringct("Afghanistan");
			acp.enteringloginName("Moresh");
			Thread.sleep(2000);
			acp.enteringloginPass("Gayke1234");
			acp.enteringloginPasscnf("Gayke1234");
			Thread.sleep(5000);
			acp.clickLoginonewslettorNo();
			acp.clickLoginoncontinuebutton();
			Thread.sleep(5000);
			logger.info("Detail enterd succefully");
			System.out.println("Executed 1");
	 }
	
	@Test
	
	public void Login() {
		
		IndexPage p= new IndexPage(driver);
//		p.welcomeMenu();
		logger.info("click on menu option");
	//	p.continueButton();
		logger.info("Click on login");


//
//		HomePage hp= new HomePage(driver);
//		hp.menuOption();
//		hp.fregnance();
//
//		AddToCart ac= new AddToCart(driver);
//		ac.Productimage();
//
//		AddToC"art1 ac1= new AddToCart1(driver);
//		ac1.cart();
	}
@Test
public void verifyLogin() throws IOException {
	
	AccountLogin pg = new AccountLogin(driver);
	pg.welcomeMenu();
	pg.username1("Moreshwar");
	pg.passwors1("Gayke@123");
	logger.info("Entering Uname & Pass");
	pg.loginButton();
	logger.info("Clicked on login button");
	
	HomePage hp= new HomePage(driver);
String userName=	hp.getUsernameText();
if(userName.equals("Welcome back Moreshwar")) {
	logger.info("Verify login - Passed");
	captureScreenShot(driver, "verifyLogin");
Assert.assertTrue(true);
}
else {
	logger.info("Verify login - Failed");
	captureScreenShot(driver, "verifyLogin");
	Assert.assertTrue(false);
}
}

}
