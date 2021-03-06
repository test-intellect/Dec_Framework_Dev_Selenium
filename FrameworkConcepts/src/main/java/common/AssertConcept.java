package common;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConcept {




	@Test(enabled = false)
	public void hardAssert() 
	{

		int i =100;

		if(i==1000)
		{
			System.out.println("Pass");
		}else 
		{
			System.out.println("Fail");
			Assert.fail(); // Hard assert

		}

		System.out.println("Step 3");

	}


	@Test
	public void softAssert() 
	{
		SoftAssert sa = new SoftAssert();
		
		int i =1000;

		if(i==1000)
		{
			System.out.println("Pass");
		}else 
		{
			System.out.println("Fail");
			sa.fail();

		}

		System.out.println("Step 3");
		
		
		sa.assertAll();
	}
}
