package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import gmailutility.GmaiilcommonUtilfile;

public class GloginPage 

{
	
    public WebDriver driver;
	WebDriverWait wait;
	GmaiilcommonUtilfile sShot;
	
	
	
	
	@FindBy(id="gb_70")
	WebElement gmailBtn;
	
	@FindBy(id ="identifierId")
	WebElement userID;
	
	@FindBy(name ="password" )
	WebElement userPassword;
	
	@FindBy(id = "identifierNext")
	WebElement nextBtn;
	
	@FindBy(xpath ="//*[@name='q']")
	WebElement googleSearch;
	
	
	
       	public GloginPage(WebDriver driver)
	{
		this.driver = driver;		
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 8);
		sShot = new GmaiilcommonUtilfile(driver);
		
	}
	
	
	public void gmailLogin(String userName, String password)
	{
		googleSearch.click(); 
		String attribute =googleSearch.getAttribute("aria-haspopup"); 
		
		System.out.println("The attribute is "+attribute);		
		googleSearch.sendKeys("Hemanth");
		
		gmailBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(userID)).click();
		userID.sendKeys(userName);
		try 
		{
			sShot.takeScreenShot("GmailUserNamePage");
		} 
		
		catch (Throwable e) 
		{
		
			e.printStackTrace();
		}
		
		nextBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(userPassword)).click();		
		userPassword.sendKeys(password);
		nextBtn.click();
		
		
	}
	

}
