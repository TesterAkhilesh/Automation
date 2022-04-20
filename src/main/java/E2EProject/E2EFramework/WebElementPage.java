package E2EProject.E2EFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementPage {
	public WebDriver driver;
	
	public WebElementPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By text = By.xpath("//input[@type='text']");
	By number = By.xpath("//input[@type='number']");
	By datePicker = By.xpath("//input[@type='date']");
	
	
	
	public WebElement text()
	{
		return driver.findElement(text);
	}
	public WebElement number()
	{
		return driver.findElement(number);
	}
	public WebElement datePicker()
	{
		return driver.findElement(datePicker);
	}
	

}
