package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase {

	//Page-Factory - OR
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/div[3]/a")
	WebElement signupbtn;
	
	//initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//validating page title 
	public String validatelogin() {
		return driver.getTitle();
	}
	
	public HomePage login(String em,String pwd) { //returns home-page class object
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		
	}
}
