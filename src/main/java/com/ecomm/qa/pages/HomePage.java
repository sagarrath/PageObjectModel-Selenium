package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class HomePage extends TestBase{
	//OR Object Repository
	
	

	@FindBy(xpath="//input[@name=\'userId\']")
WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	//@FindBy(xpath="//span[@class=\'ng-star-inserted\']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement submit;
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/ul[1]/li[1]/a[1]")
	WebElement homefirstfit;
	
	//How to initialize page factory

	public HomePage() throws IOException {
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
		homefirstfit.click();
		
	}
public void clickFirstFit()
{
	homefirstfit.click();
}
}
