package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ContactPage extends Testbase{
	LoginPage lp;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Contacts')]")
	WebElement web_contact;
	
	@FindBy(how=How.XPATH, using="//input[@name,'first_name']";
	WebElement web_fstname;

	public ContactPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_contact() throws IOException
	{
		lp=new LoginPage();
		lp.login_click(username, pwd);
		Actions action=new Actions(driver);
		action.moveToElement(web_contact).click().perform();
		//web_contact.click();
	}

}
