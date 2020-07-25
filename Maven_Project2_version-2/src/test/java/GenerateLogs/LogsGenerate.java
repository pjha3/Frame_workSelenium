package GenerateLogs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

import com.ActiTime.LoginPageObject.FacebookLogin;

public class LogsGenerate 
{
	public static final Logger logs=Logger.getLogger(LogsGenerate.class.getName());
	
	@BeforeTest
		public void loadlogfile1()
		{
			String propertyfile="D:\\seleniumAutomation\\Maven_Project2_version-2\\src\\test\\java\\GenerateLogs\\logs.properties";
			PropertyConfigurator.configure(propertyfile);
			
			
		}
	

	
		
	}


