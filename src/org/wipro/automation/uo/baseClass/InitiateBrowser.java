package org.wipro.automation.uo.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.uo.utilitiesClass.ReadPropFiles;

public class InitiateBrowser 
{

public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfigdata("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();    //launch the chrome browser
		}
		
		else if(ReadPropFiles.readconfigdata("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();  //launch the edge browser
			
		}
		
		else
		{
			driver= new ChromeDriver();    //launch the chrome browser
		}
		
		
		
		driver.get(ReadPropFiles.readconfigdata("ApplicationURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
		
		
	}
	
}
