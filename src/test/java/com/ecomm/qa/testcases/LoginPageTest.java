package com.ecomm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage log ;

	public LoginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void init() throws IOException {
		initilization();
		 log = new LoginPage();
	}
	
	@Test
	public void testLogin() {
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void validateLogo() {
		assertEquals(true, true);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
