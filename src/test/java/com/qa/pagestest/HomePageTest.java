package com.qa.pagestest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends Testbase {
	LoginPage lp;
	HomePage hp;

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	@BeforeMethod
	public void home_setup() throws IOException {
		//intialization();
		//lp=new LoginPage();
	hp=new HomePage();
		
	}
	
	@Test(priority =1)
	public void homepage_test() throws IOException 
	{
		
		//hp.getHomeTitle();
		Assert.assertEquals(hp.getHomeTitle(), "CRM");
	}

	@Test(priority=2)
	public void  clickcontact_test() throws IOException
	{
		hp.click_contact();
		hp.click_new_contact();
	}
}
