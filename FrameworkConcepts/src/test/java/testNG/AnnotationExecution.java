package testNG;

import org.testng.annotations.Test;

import common.PrintUtills;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExecution {
  @Test(enabled = false )
  public void test1()
  {  
	  PrintUtills.logMsg("Test 1 ");
  }
  
  @Test()
  public void test2()
  {
	  PrintUtills.logMsg("Test 2 ");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	 PrintUtills.logMsg("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("afterSuite");
  }

}
