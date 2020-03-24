package utility;

import java.io.File;
import  org.openqa.selenium.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShotUtility 

{
	WebDriver driver;
	
	ScreenShotUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void takeScreenShot() throws Exception, Throwable	
	{
		
	try
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
	   File source =ts.getScreenshotAs(OutputType.FILE);	   
	   FileHandler.copy(source, new File("/gmaillogin/report/scrshot"));
	}
     catch ( Exception e)
     {
    	 System.out.println(e);
     }
	}
}
