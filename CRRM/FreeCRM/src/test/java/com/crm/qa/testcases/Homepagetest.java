package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Login;
import com.crm.qa.pages.contactpage;
import com.crm.qa.pages.homepage;
import com.crm.qa.util.TestUtil;



public class Homepagetest extends Testbase {
	
	Login Loga;
	homepage homa;
	TestUtil util;
	contactpage con;

	
	public Homepagetest(){
		super();}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			util = new TestUtil();
			Loga = new Login();
			con = new contactpage();
			homa=Loga.login(prop.getProperty("username"), prop.getProperty("password"));
		}

		@Test(priority=1)
		public void verifyHomePageTitleTest(){
			String homePageTitle = homa.verifyHomePageTitle();
			Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
		}		
		@Test(priority=2)
		public void verifyUserNameTest(){
			util.switchToFrame();
			Assert.assertTrue(homa.verifyCorrectUserName());
		}
		@Test(priority=3)
		public void verifyContactsLinkTest(){
			util.switchToFrame();
			con = homa.clickOnContactsLink();
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
}}