package com.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class LoginPage extends Testbase{
	 
   @FindBy(how=How.XPATH, using= "//input[@placeholder='E-mail address']")
   public static WebElement web_username;
   
   @FindBy(how=How.XPATH, using="//input[@placeholder='Password']")
   public static WebElement web_password;
   
   @FindBy(how=How.XPATH, using="//div[@class='ui fluid large blue submit button']")
   public static WebElement web_login;
   

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		
		
		//driver=new ChromeDriver();
		
		System.out.println("url from loginpage"+url);
		
		
		intialization();
		//driver.get(url);
		PageFactory.initElements(driver, this);
	}

	public void login_click(String username ,String pawd) 
	{
		
		//System.out.println("username      "+username);
		web_username.sendKeys(username);
		web_password.sendKeys(pawd);
		web_login.click();
		
		
	}
}
