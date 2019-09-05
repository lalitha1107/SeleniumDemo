package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {
	LoginPage lp;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Contacts')]")
	WebElement web_contact;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'New')]")
	WebElement web_newcontact;

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		lp=new LoginPage();
		//intialization();
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String getHomeTitle() throws IOException
	{
		
		lp.login_click(username, pwd);
		
		return driver.getTitle();
	}
	
	public void click_contact() throws IOException
	{
		
		lp.login_click(username, pwd);
		web_contact.click();
		//web_contact.click();
	}
	
	public void click_new_contact() throws IOException
	{
		
		//lp.login_click(username, pwd);
		web_newcontact.click();
		//web_contact.click();
	}

}
