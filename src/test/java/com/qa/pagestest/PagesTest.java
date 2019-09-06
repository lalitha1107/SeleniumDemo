package com.qa.pagestest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class PagesTest extends Testbase{
	LoginPage lp=new LoginPage();
	
	
	public PagesTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	@BeforeMethod
	public void login_setup() throws IOException
	{
		 //intialization();
		
		
	}
	
	
	
	@Test
	public void login_Test() throws IOException 
	{
		//lp =new LoginPage(); 
		lp.login_click(username, pwd);
	}
	
	@AfterMethod
	public void quit_driver()
	{
		driver.close();
	}
}
