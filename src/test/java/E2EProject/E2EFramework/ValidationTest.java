package E2EProject.E2EFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Resources.BaseClass;

public class ValidationTest extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public ExtentReports ex ;
	@Test
	public void validateText() throws Exception
	{
		driver = initilizeDriver();
		ex = ExtentReport();
		driver.get(prop.getProperty("URL"));
		
		
		
		MainPage m = new MainPage(driver);
		Assert.assertEquals(m.text().getText(), "UI Automation");
		log.error("Text is not matching");
		ex.createTest("Text is not matching");
		
	}
	
	@AfterTest
	void close()
	{
		driver.close();
	}
//	
//	@AfterSuite
//	void reportGeneration()
//	{
//		driver.quit();
//	}
	
//	@AfterSuite
//	void report()
//	{
//		ex.flush();
//	}
	
	

}
