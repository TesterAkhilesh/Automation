package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNG {

	static ExtentReports ex;
	public static ExtentReports getReport()
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
 