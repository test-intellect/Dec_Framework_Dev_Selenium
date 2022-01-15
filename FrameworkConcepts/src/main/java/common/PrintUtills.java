package common;

import org.testng.Reporter;

public class PrintUtills {

	
	public static void logMsg(String msg) 
	{
		System.out.println(msg);
		Reporter.log(msg);
		// Extent report log (msg)

	}
	
	
	public static void logError(String msg) 
	{
		System.err.println(msg);
		Reporter.log(msg);
		// Extent report log (msg)
	}
	
	
}
