package testcases;

import org.testng.annotations.*;

import common.ExcelConfig;

public class RegressionTest extends TestNGBaseRunner
{
	
	@BeforeClass
	public void beforeClass() throws Exception 
	{
		excel = new ExcelConfig("./TestData/Workbook.xlsx", "RegressionData");
	}
	//1000 

  @Test
  public void validateConfigurationResetFunctionality() 
  {
	  System.out.println("Test");
	  _loginPage.clickConfigurationLink();
//	  _ConfigurationPage.setRandomConfigurationValues();
//	  _ConfigurationPage.resetDefault();
//	  _ConfigurationPage.checkDefaultValues();
	  
  }

}
