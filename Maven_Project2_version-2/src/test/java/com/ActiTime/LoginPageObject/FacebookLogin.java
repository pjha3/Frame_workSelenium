package com.ActiTime.LoginPageObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import GenerateLogs.LogsGenerate;


public class FacebookLogin extends LogsGenerate{
	WebDriver driver;
	public FacebookLogin(WebDriver driver)
	{
		this.driver=driver;//keyword can be used to refer the current object in a method or constructor.
	}
	@FindBy(name="email") 
	@CacheLookup //will keep webelement in cache memory and not check again 
	//and again so performance will be high when you have huge application
	WebElement username;
	@FindBy(how=How.NAME, using="pass")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.XPATH,using="//*[@value='Log In']") 
	@CacheLookup
	WebElement LoginButton;
//	@FindBy(how=How.LINK_TEXT, using="ForgetPsw")
//	@CacheLookup
//	WebElement Forgetpsw;
//	
	public static Logger logs=Logger.getLogger(FacebookLogin.class.getName());
	public void login_Actitime(String userid,String pas)
	{
		
		logs.info("enter username");
		username.sendKeys(userid);
		logs.info("username entered");

		password.sendKeys(pas);
		logs.info("password entered");

		LoginButton.click();
		logs.info("login button pressed");

	}

//	public void searchproduct()
//	{
//		Forgetpsw.click();
//	}

}
