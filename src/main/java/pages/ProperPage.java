package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;

public class ProperPage 
{
	static Properties prop ;
	
	public static void propfileLoad() throws Exception 
	{
		
		File file = new File("./src/main/resources/datas.properties");
		prop  = new Properties();
		FileInputStream reader = new FileInputStream(file);	
		prop.load(reader);	
	}
	
	
	public String provideData(String data) throws Exception
	{
		propfileLoad();		
		String returnData =prop.getProperty(data);
		return returnData;
	
	}
	
	
	
	
	/*  public void selectdatebyjs(WebDriver driver,webElement element, string date)
	 { 
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	     js.executeScript("argument[0].setAttribute('value','"+date+"');", element);
	     
	*/

}
