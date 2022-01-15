package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import common.ExcelConfig;
import common.ExtentReport;
import common.SeleniumGenerics;
import pages.ConfigurationPage;
import pages.LoginPage;

public class TestNGBaseRunner extends SeleniumGenerics{

	
	
	public WebDriver driver=null;

	public LoginPage _loginPage= null;
	public ConfigurationPage _ConfigurationPage=null;
	
	public ExcelConfig excel;
	

	@BeforeSuite
	public void beforeSuite() 
	{
		ExtentReport.startReport();
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		ExtentReport.endReport();
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		sa= new SoftAssert();
		driver = browserStart("https://bptravel.blueprism.com/");
		
		//Create Page objects 
		_loginPage = PageFactory.initElements(driver, LoginPage.class);
		_ConfigurationPage=PageFactory.initElements(driver, ConfigurationPage.class);
	}
	
	
	@AfterMethod
	public void afterMethod() 
	{
		browserClose(driver);
	}
	
}
