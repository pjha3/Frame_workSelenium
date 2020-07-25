package com.ActiTime.LoginTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.ActiTime.BrowserDriver.ConfigBrowser;
import com.ActiTime.LoginPageObject.FacebookLogin;

import GenerateLogs.LogsGenerate;



public class FbLoginTest extends LogsGenerate{
	
	public static Logger logs=Logger.getLogger(FbLoginTest.class.getName());

	@Test
	public void check_validUser()
	{
		logs.info("Launch browser");
	//this will launch browser and specific url
	WebDriver driver=ConfigBrowser.startBrowser("firefox", "https://www.facebook.com");
	logs.info("browser launched");
		
	//created page object using page factory
	FacebookLogin login_page=PageFactory.initElements(driver, FacebookLogin.class);
	logs.info("call elements by pageobjects");
	//LoginPage login_page_Old=PageFactory.initElements(driver, LoginPage.class);
		
	//call the method
	login_page.login_Actitime("admin", "manager");
	logs.info("perform events from given methods");
	}


}
