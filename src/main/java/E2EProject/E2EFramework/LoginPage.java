package E2EProject.E2EFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By email = By.xpath("//input[@class='email_input']");
	By password = By.xpath("//input[@class='password_input']");
	By Login = By.xpath("//button[@class='button']");
	
	public WebElement email()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElementPage Login()
	{
		 driver.findElement(Login).click();
		 WebElementPage elem = new  WebElementPage (driver);
		 return elem;
		 
	}
}
