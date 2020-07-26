package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseTest;

public class ActiTimePages 
{
	public WebDriver driver;
	public BaseTest waitele;
	
	@FindBy(name="username")
	@CacheLookup
	WebElement userid;
	
	@FindBy(name="pwd")
	@CacheLookup
	WebElement password;
	@FindBy(id="loginButton")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@class='navItem relative']//*[@href='/tasks/otasklist.do']")
	@CacheLookup
	WebElement tasksLink;
	
	@FindBy(xpath="//*[text()='Projects & Customers']")
	@CacheLookup
	WebElement projAndCust;
	
	@FindBy(xpath="//*[@value='Create New Customer']")
	@CacheLookup
	WebElement newcustBtn;
	
	@FindBy(xpath="//*[@name='name']")
	@CacheLookup
	WebElement custTxtBx;
	
	@FindBy(xpath="//*[@name='createCustomerSubmit']")
	@CacheLookup
	WebElement clickCustBtn;
	
	@FindBy(id="logoutLink")
	@CacheLookup
	WebElement logOut;
	
	
	public ActiTimePages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteruid(String uid)
	{
		userid.sendKeys(uid);
	}
	
	public void enterpsw(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	public void clickLogout()
	{
		logOut.click();
	}
	
	public void clickTasks()
	{
//		waitele.iWait(driver, 20, tasksLink);
		tasksLink.click();
	}
	public void clickProjAndCust()
	{
//		waitele.iWait(driver, 10, projAndCust);
		projAndCust.click();
	}
	
	public void newCustLink()
	{
//		waitele.iWait(driver, 5, newcustBtn);
		newcustBtn.click();
	}
	
	public void enterCustName(String custName)
	{
//		waitele.iWait(driver, 5, custTxtBx);
		custTxtBx.sendKeys(custName);
	}
	
	public void clickSubmit()
	{
//		waitele.iWait(driver, 5, clickCustBtn);
		clickCustBtn.click();
	}
	

}
