package com.ecomm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage log;

	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void init() throws IOException {
		initilization();
		 log = new LoginPage();
		
	}
	
	@Test
	public void validate() {
		assertEquals(true, true);
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
