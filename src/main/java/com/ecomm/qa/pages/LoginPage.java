package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//OR Object Repository
	
	@FindBy(xpath="//input[@id='login']")
	WebElement username;

	//@FindBy(xpath="//input[@name=\'userId\']")
//	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	//@FindBy(xpath="//span[@class=\'ng-star-inserted\']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement submit;
	
	//How to initialize page factory

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions , features
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return submit.isDisplayed();
	}
	
	public void login(String un, String pwd) {
		//loginButton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
	}

	public void HomePage(String property) {
		// TODO Auto-generated method stub
		
	}

}
