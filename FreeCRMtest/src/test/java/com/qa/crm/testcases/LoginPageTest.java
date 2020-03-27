package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage= new LoginPage();
		
	}
	
	@Test(priority=1)
	public void logintitletest() {
		String title = loginpage.validatelogin();;
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void logintest() {
		homepage = loginpage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
