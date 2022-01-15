package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.PrintUtills;
import common.SeleniumGenerics;

public class LoginPage extends SeleniumGenerics{

	private WebDriver driver;
	
	//public WebElement UserNameEle = driver.findElement(By.id("username"));
	//public WebElement PasswordEl7 = driver.findElement(By.id("password"));
	
	// Loacting the page webelements 
	@FindBy( id = "username")
	WebElement UserNameEle;
	
	@FindBy(id = "password")
	WebElement PasswordEle;
	
	@FindBy(xpath = "//div[@id='body']/table/tbody/tr[3]/td[2]/span")
	WebElement LogInButtonEle;
	
	@FindBy(id = "message")
	WebElement errortextEle;
	
	@FindBy(xpath="//a[text()='Configuration']")
	WebElement configEle;
	
	
	// Pagemethods 
	
	public void loginWithValidCredentials(String userName, String password, String URL) 
	{
		enterText(UserNameEle, userName);
		enterText(PasswordEle, password);
		clickElement(LogInButtonEle);
		
		String actualURL = getCurrentURL(driver);
		if(actualURL.equals(URL))
		{
			PrintUtills.logMsg("Application successfully logged in with given credentialss");
		}else 
		{
			PrintUtills.logError("Application landed to invalid page :: "+actualURL);
		}
	}
	
	public void loginWithINValidCredentials(String userName, String password, String expectedErrorText) 
	{
		enterText(UserNameEle, userName);
		enterText(PasswordEle, password);
		clickElement(LogInButtonEle);
		
		String actualErrorMsg= getText(errortextEle);
		if(actualErrorMsg.equals(expectedErrorText))
		{
			PrintUtills.logMsg("Application not logged in.");
		}else 
		{
			PrintUtills.logError("Application logged in successfully :: "+actualErrorMsg);
		}
	}
	
	public void clcikConfigurationLink()
	{		
		clickElement(configEle);
	}
	
}


