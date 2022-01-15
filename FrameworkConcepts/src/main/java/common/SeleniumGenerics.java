package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumGenerics {

	
	// Webdriver Commands
	public void browserStart(String URL) 
	{
		WebDriver driver =null;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(URL);
	}

	public void browserClose(WebDriver driver) 
	{
		driver.close();			
		PrintUtills.logMsg("Browser is closed");
	}

	public void browserQuit(WebDriver driver)
	{
		driver.quit();
		PrintUtills.logMsg("Quit the browser");
	}
	
	public String getTitle(WebDriver driver)
	{
		String value= driver.getTitle();
		PrintUtills.logMsg("This is the Title : "+ value);
		return value;
	}
	public String getCurrentURL(WebDriver driver)
	{
		String value=driver.getCurrentUrl();
		PrintUtills.logMsg("Current URL is : "+value);
		return value;
	}

	public String  getPageSource(WebDriver driver)
	{
		String v =driver.getPageSource();
		PrintUtills.logMsg("This is the Pagesource: "+v);
		return v;
	}

	public void NavigateBack(WebDriver driver)
	{
		driver.navigate().back();
		PrintUtills.logMsg("Navigate Back ");
	}
	public void NavigateFoward(WebDriver driver)
	{
		driver.navigate().forward();
		PrintUtills.logMsg("Navigate Forward ");
	}
	public void Refresh(WebDriver driver)
	{
		driver.navigate().refresh();
		PrintUtills.logMsg("Refresh the browser");
	}

	// Webelements commands 
	public void enterText(WebElement ele, String value) 
	{
		ele.sendKeys(value);		
		PrintUtills.logMsg("Text Entered into textbox:: "+ value);
	}
	public void clear(WebElement ele)
	{
		ele.clear();
		PrintUtills.logMsg("Text is Cleared");
	}
	
	public void clickElement(WebElement ele) 
	{
		ele.click();
	}
	
	public String getText(WebElement ele) 
	{
		String value = ele.getText();
		PrintUtills.logMsg("GetText value is :: "+ value);
		return value;
	}
	
	public String getAttribute(WebElement ele, String AttributeName)
	{
		String st= ele.getAttribute(AttributeName);
		PrintUtills.logMsg("Getattribute value is:"+st);
		return st;
	}

	public void selectByValue(WebElement ele, String value) 
	{
		Select st = new Select(ele);
		st.selectByValue(value);
	}

	public void selectByIndex(WebElement ele, int index)
	{
		Select st = new Select(ele);
		st.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement ele, String value)
	{
		Select st = new Select(ele);
		st.selectByVisibleText(value);
	}
	
	public String getDefaultDropdownValue(WebElement ele) 
	{
		Select st = new Select(ele);
		String v =st.getFirstSelectedOption().getText();
		PrintUtills.logMsg("Default value form dropdown is :: "+ v);
		return v;
	}

	public void switchToFrameByIndex(WebDriver driver, int FrameIndex) 
	{
		driver.switchTo().frame(FrameIndex);
	}
	
	public void switchToFrameByString(WebDriver driver, String NameOrID) 
	{
		driver.switchTo().frame(NameOrID);
	}
	
	public void switchToFrameByWebElement(WebDriver driver, WebElement ele) 
	{
		driver.switchTo().frame(ele);
	}
	
	public void switchFrameToDefault(WebDriver driver) 
	{
		driver.switchTo().defaultContent();
	}
	
	public void switchToParentFrame(WebDriver driver) 
	{
		driver.switchTo().parentFrame();
	}

	public void mouseMove(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void dragAndDrop(WebDriver driver, WebElement src,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();

	}
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	public String alertGetText(WebDriver driver)
	{
		String text = driver.switchTo().alert().getText();
		PrintUtills.logMsg("Alert popup getText is"+text);
		return text;

	}
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();	
		
//		Alert at = driver.switchTo().alert();
//		at.accept();

	}
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();

	}
	public void alertSendKeys(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);

	}
	
	public boolean checkIfEleIsDisplayed(WebElement ele) 
	{
		boolean status = true;
		try
		{
		if(ele.isDisplayed()==true) 
		{
			PrintUtills.logMsg("Element is Displayed in UI");
		}
		}catch (Exception e)
		{
			status=false;
		}
		
		return status;
	}
	
	public boolean checkIfEleIsEnabled(WebElement ele) 
	{
		boolean status = true;
		if(ele.isEnabled()==true) 
		{
			PrintUtills.logMsg("Element is Enabled in UI");
		}else 
		{
			status =false;
		}
		
		return status;
	}
	
	public boolean checkIfEleIsSelected(WebElement ele) 
	{
		boolean status = true;
		if(ele.isSelected()==true) 
		{
			PrintUtills.logMsg("Element is Selected in UI");
		}else 
		{
			status =false;
		}
		
		return status;
	}
}



