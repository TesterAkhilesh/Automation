package E2EProject.E2EFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	public WebDriver driver;
	
	By link = By.xpath("//div[contains(text(),'UI Automation Testing')]");
	By text = By.xpath("//div[contains(text(),'UI Automation Testing')]");
	
	
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage link ()
	{
		 driver.findElement(link).click();
		 LoginPage obj = new LoginPage(driver);
		 return obj;
	}
	public  WebElement text()
	{
		return driver.findElement(text);
		
	}
	
	
	
}
