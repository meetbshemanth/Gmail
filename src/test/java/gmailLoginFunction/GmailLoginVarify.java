package gmailLoginFunction;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import driverSetUpforGoogle.DriverSetUp;
import listanersUtility.Listaners;
import pages.GloginPage;
import pages.ProperPage;

@Listeners(Listaners.class)	
public class GmailLoginVarify 
{
	
	DriverSetUp cdriver;
	GloginPage logpage;
	ProperPage propage;
	
	
	
	
	String url;
	String userName;
	String password;
	
	@BeforeSuite	
	public void loadData() throws Exception
	{
		 propage = new ProperPage();
		 url = propage.provideData("gURL");
		 System.out.println(url);
		 userName=propage.provideData("gUID");
		 password = propage.provideData("gpassword");
	}
		
	@Test()
	public void requiredDataSetUp() throws IOException 
	{				
		cdriver = new DriverSetUp();		
		cdriver.chromeDriverSetup(url);
		logpage = new GloginPage(cdriver.driver);
		
				
	}
	
	@Test(dependsOnMethods = "requiredDataSetUp")
	public void GmailLoginWithVaidData() throws IOException
	{		
		logpage.gmailLogin(userName, password);
	}
	
//		
//	@AfterSuite
//	public void closeBrowser()
//	{
//		cdriver.closeDriver();
//	}
//	
	

}
