package Resources;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	public ExtentReports ex;
	
	public  WebDriver initilizeDriver() throws Exception
	{
		prop = new Properties();
		FileReader obj = new FileReader("data.properties");
		prop.load(obj);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome99\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
	public ExtentReports ExtentReport()
	{
		String path = System.getProperty("user.dir", "\\reports\\index.html");
		ExtentSparkReporter rep = new ExtentSparkReporter(path);
		rep.config().setReportName("UI Automation");
		ex = new ExtentReports();
		ex.attachReporter(rep);
		ex.setSystemInfo("Akhilesh", "Tester");
		
		return ex;
	}
}
