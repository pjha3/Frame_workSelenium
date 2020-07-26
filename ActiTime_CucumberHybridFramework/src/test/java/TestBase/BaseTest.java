package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.ActiTimePages;

public class BaseTest 
{
	
	public Properties prop;
	public FileInputStream file;
	public WebDriver driver;
	public WebDriverWait wait;
	public ActiTimePages pages;
	
	public void configproperty() throws IOException
	{
		prop=new Properties();
		file=new FileInputStream("D:\\seleniumAutomattion4\\ActiTime_CucumberHybridFramework\\config.properties");
		prop.load(file);
	}
	
	public void iWait(WebDriver driver,int timeunit,WebElement element)
	{
		wait=new WebDriverWait(driver, timeunit);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}

}
