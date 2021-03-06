package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	public String TestName,TestDesc,TestData;

	private String Excel_SheetName;
	private String Excel_wbName;
	
	public ExcelConfig(String workbookpath, String SheetName) throws Exception 
	{
		this.Excel_wbName=workbookpath;
		this.Excel_SheetName =SheetName;
	}
	
	
	public  void getTestData(String ExpectedTestCaseName) throws IOException 
	{
		File file =new File(Excel_wbName);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh  = wb.getSheet(Excel_SheetName);
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
		TestName = sh.getRow(i).getCell(0).getStringCellValue();
		if(TestName.equalsIgnoreCase(ExpectedTestCaseName))
		{
			TestDesc= sh.getRow(i).getCell(1).getStringCellValue();
			TestData = sh.getRow(i).getCell(2).getStringCellValue();
			break;
		}
		}
		
		ExtentReport.setTestName(TestName, TestDesc);
		splitDataAndLoadToHashMap(TestData);
	}
	
	
	public void splitDataAndLoadToHashMap(String data) 
	{
		SeleniumGenerics.hmap.clear();
		
		for(int i=0; i<data.split("#").length;i++)
		{
			String KeyValue = data.split("#")[i];
			
			String key = KeyValue.split("=")[0];
			String value = KeyValue.split("=")[1];
			
			SeleniumGenerics.hmap.put(key, value);
			
		}
		
		PrintUtills.logMsg("Test Data for the testcase is :: "+ SeleniumGenerics.hmap.entrySet());
		
		
	}
	
	
}
