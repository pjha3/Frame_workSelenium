package TestSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.ActiTimePages;
import TestBase.BaseTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class StepDef extends BaseTest
{
	WebDriver driver;
	public Logger logger;
	
	@Before
	public void setups() throws IOException
	{
		logger=Logger.getLogger(StepDef.class);
		PropertyConfigurator.configure("D:\\seleniumAutomattion4\\ActiTime_CucumberHybridFramework\\logs.properties");
		prop=new Properties();
		FileInputStream file=new FileInputStream("D:\\seleniumAutomattion4\\ActiTime_CucumberHybridFramework\\config.properties");
		prop.load(file);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver"));
		driver=new ChromeDriver();
		logger.info("*** Browser Launched ***");
		driver.manage().window().maximize();
		logger.info("*** Chrome maximized ***");
		
	}
	
	
	@Given("^User should launch the browser$")
	public void user_should_launch_the_browser() throws Throwable {
	    
		pages=new ActiTimePages(driver);
		logger.info("*** Browser Launched by user ***");
	}

	@Then("^User should open application URL$")
	public void user_should_open_application_URL() throws Throwable {
	   driver.get("http://127.0.0.1/login.do");
	   logger.info("*** Application Launched ***");
	}

	@Then("^User should enter valid userid$")
	public void user_should_enter_valid_userid() throws Throwable {
//	    driver.findElement(By.name("username")).sendKeys("admin");
		pages.enteruid("admin");
		logger.info("*** User entered user name ***");
	}

	@Then("^User should enter valid password$")
	public void user_should_enter_valid_password() throws Throwable {
//	    driver.findElement(By.name("pwd")).sendKeys("manager");
		pages.enterpsw("manager");
		logger.info("*** User entered password ***");
	}

	@Then("^User should click On login button$")
	public void user_should_click_On_login_button() throws Throwable {
//	   driver.findElement(By.id("loginButton")).click();
		pages.clickLogin();
		logger.info("*** User clicked Login button ***");
	}

	@Then("^User should verify home page title$")
	public void user_should_verify_home_page_title() throws Throwable {
	    String exptitle = "actiTIME - Enter Time-Track";
	    if(driver.getPageSource().contains(exptitle))
	    {
	    	System.out.println("Title verified");
	    	logger.info("*** Page Title verified ***");
	    }
	    else
	    {
	    	System.out.println("Title not verified");
	    	logger.info("*** Title not verified ***");
	    }
	}

	@Given("^User should click on Task link$")
	public void user_should_click_on_Task_link() throws Throwable {
//	   driver.findElement(By.xpath("//*[@class='navItem relative']//*[@href='/tasks/otasklist.do']")).click();
		pages.clickTasks();
		logger.info("*** User clicked on Task Link ***");
	}

	@Given("^User should click on Project and customer link$")
	public void user_should_click_on_Project_and_customer_link() throws Throwable {
//	    driver.findElement(By.xpath("//*[text()='Projects & Customers']")).click();
		pages.clickProjAndCust();
		logger.info("*** User clicked on project and customer link ***");
	}

	@Then("^User should click on New customer button$")
	public void user_should_click_on_New_customer_button() throws Throwable {
//	    driver.findElement(By.xpath("//*[@value='Create New Customer']")).click();
		pages.newCustLink();
		logger.info("*** User clicked on New customer Link ***");
	}

	@Then("^user should enter customer name in text box$")
	public void user_should_enter_customer_name_in_text_box() throws Throwable {
//	   driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Avinash");
		pages.enterCustName("Kunal");
		logger.info("*** User entered Customer Name ***");
	}

	@Then("^user should click on create customer button$")
	public void user_should_click_on_create_customer_button() throws Throwable {
//	    driver.findElement(By.xpath("//*[@name='createCustomerSubmit']")).click();
		pages.clickSubmit();
		logger.info("*** User clicked on Submit Customer ***");
	}
	@Then("^user should close browser$")
	public void user_should_close_browser() throws Throwable {
	    driver.close();
	    logger.info("*** User closed browser ***");
	}


	@Given("^User should verify homepage Logo$")
	public void user_should_verify_homepage_Logo() throws Throwable {
	   WebElement logo = driver.findElement(By.xpath("//*[@src='/img/default/top_nav/default-logo.png?hash=797058701']"));
	   if(logo.isDisplayed())
	   {
		   System.out.println("Logo verified");
		   logger.info("*** Logo is displayed***");
	   }
	   else
	   {
		   System.out.println("Logo not verified");
		   logger.info("*** Logo is not displayed ***");
	   }
	}

	@Given("^user should click on logout link$")
	public void user_should_click_on_logout_link() throws Throwable {
//	   driver.findElement(By.id("logoutLink")).click();
		pages.clickLogout();
		logger.info("*** User click on LogOut ***");
	}

	@Then("^User should verify Login page title$")
	public void user_should_verify_Login_page_title() throws Throwable {
	    if(driver.getTitle().contains("actiTIME - Login"))
	    {
	    	System.out.println("Tilte verified-Test passed");
	    	logger.info("*** Login Page title verified ***");
	    }
	    else
	    {
	    	System.out.println("Title not verified");
	    	logger.info("*** Login page title not verified ***");
	    }
	}

	
}
