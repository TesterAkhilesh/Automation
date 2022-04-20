package E2EProject.E2EFramework;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Resources.BaseClass;
import Resources.BaseClass;


public class MainTest extends BaseClass{

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public ExtentReports ex ;
	@Test
	void MainPage() throws Exception
	{
		driver = initilizeDriver();
		// doni driver chi value samme pahije manun use kelai he step
		ex = ExtentReport();
		driver.get("http://localhost:3000/");
		//driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		MainPage m = new MainPage(driver);
		LoginPage obj = m.link();//obj loginpage cha
		
		 
		log.info("Clicked on link successfully");
		ex.createTest("Clicked on link successfully");
		
		obj.email().sendKeys(prop.getProperty("email"));
		log.info("Email id send successfully");
		ex.createTest("Email id send successfully");
		
		obj.password().sendKeys(prop.getProperty("pass"));
		log.info("Password send successfully");
		obj.email().click();
		ex.createTest("Password send successfully");
		
		WebElementPage elem = obj.Login();
		log.info("Clicked on login button successfully");
		ex.createTest("Clicked on login button successfully");
		
		elem.text().sendKeys(prop.getProperty("text"));
		log.info("Text send successfully");
		ex.createTest("Text send successfully");
		
		elem.number().sendKeys(prop.getProperty("number"));
		log.info("Number send successfully");
		ex.createTest("Number send successfully");
		
		elem.datePicker().sendKeys(prop.getProperty("date"));
		log.info("Date send successfully");
		ex.createTest("Date send successfully");
	}
	
	

	@AfterTest
	void closeBrowser()
	{
		driver.close();
	}
	
//	@AfterSuite
//	void report()
//	{
//		ex.flush();
//	}
//	
	
}
