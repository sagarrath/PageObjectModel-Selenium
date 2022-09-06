package com.ecomm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.HomePage;
import com.ecomm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage log ;

	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void init() throws IOException {
		initilization();

		 log= new HomePage();
	}
	
	@Test (priority =0)
	public void testLogin() {
		log.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

	
	@Test (priority =1)
	public void validateLogo() {
	log.clickFirstFit();
	}

		
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
