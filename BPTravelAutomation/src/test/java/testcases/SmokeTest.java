package testcases;

import java.io.IOException;

import org.testng.annotations.*;

import common.ExcelConfig;
import common.PrintUtills;

public class SmokeTest extends TestNGBaseRunner
{

	@BeforeClass
	public void beforeClass() throws Exception 
	{
		excel = new ExcelConfig("./TestData/Workbook.xlsx", "SmokeData");
	}

	@Test
	public void smokeTestcase_1() throws IOException 
	{

		try {
			excel.getTestData("smokeTestcase_1");

			_loginPage.loginWithValidCredentials(hmap.get("UserName"),hmap.get("Password"),hmap.get("ExpectedURL")); 


		}catch (Exception e)
		{
			PrintUtills.logError("Testcase Exception block :: "+e.getMessage());
		}

		finally {
			sa.assertAll();
		}
	}
	
	@Test
	public void smokeTestcase_2() throws IOException 
	{

		try {
			excel.getTestData("smokeTestcase_2");

			_loginPage.loginWithValidCredentials(hmap.get("UserName"),hmap.get("Password"),hmap.get("ExpectedURL")); 


		}catch (Exception e)
		{
			PrintUtills.logError("Testcase Exception block :: "+e.getMessage());
		}

		finally {
			sa.assertAll();
		}
	}

}
