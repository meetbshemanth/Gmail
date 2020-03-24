package gmailutility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GmaiilcommonUtilfile {
WebDriver driver;


public GmaiilcommonUtilfile(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void takeScreenShot(String screenshotName) throws Exception, Throwable	
	{
		
	try
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
	   File source =ts.getScreenshotAs(OutputType.FILE);	   
	   FileHandler.copy(source, new File("C:\\Users\\user\\Desktop\\interview_Assignment\\gmaillogin\\report\\"+screenshotName+".png"));
	}
     catch ( Exception e)
     {
    	 System.out.println(e);
     }
	}
}
