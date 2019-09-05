package com.qa.pagestest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.ContactPage;
import com.qa.pages.LoginPage;

public class ContactPageTest extends Testbase {
	
	ContactPage cp;
	

	public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void contactpage_setup() throws IOException
	{
		
		//cp=new ContactPage();
	}
	
	
	@Test
	public void contactpage_test() throws IOException
	{
		//cp.click_contact();
	}
	
	

}
