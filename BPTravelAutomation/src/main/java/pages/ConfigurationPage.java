package pages;

import org.openqa.selenium.WebDriver;

import common.SeleniumGenerics;

public class ConfigurationPage extends SeleniumGenerics {

	
	
	private WebDriver driver;
	public ConfigurationPage(WebDriver pageDriver) 
	{
		this.driver=pageDriver;
	}
	
	
	// Elements locate
	
	
	//Page methods
	
	public void setRandomConfigurationValues() 
	{
		selectByIndex(null, 0);
	}
	
	
	public void resetDefault() 
	{
		
	}
	
	public void checkDefaultValues() 
	{
		
	}
}
