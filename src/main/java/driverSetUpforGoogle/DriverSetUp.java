package driverSetUpforGoogle;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import gmailutility.GmaiilcommonUtilfile;


public class DriverSetUp 
{
	
	public WebDriver driver;	
	public GmaiilcommonUtilfile sShot;
	
	public void chromeDriverSetup(String Url) throws IOException
	{		 
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		 System.setProperty("webdriver.chrome.silentoutput", "true");
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-infobars");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 System.out.println(Url);
		
		 driver.get(Url);	
		 sShot = new   GmaiilcommonUtilfile(driver);
		 
		 try
		  {
			sShot.takeScreenShot("gmailLogin");
		  }
		 catch (Throwable e) 
		 {			
			e.printStackTrace();
		 }
		 
		 
		 
		 //((JavascriptExecutor)driver).executeScript("Scroll(0,400)");// scroll into parameter
		  //JavascriptExecutor je = (JavascriptExecutor) driver;
		 //((JavascriptExecutor)driver).executeScript("argument[0].scrollintoView(true));",element // scroll into element
		 
	}
	
	
	
	public void closeDriver() 
	
	{
		driver.quit();
	}
	

}
